package com.sritel.notification.service;

import com.sritel.billing.event.MonthlyStatementEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;

import static com.sritel.notification.util.GeneratePdf.generatePDFStatement;

@Service
@RequiredArgsConstructor
@Slf4j
public class BillingService {
    private final JavaMailSender javaMailSender;

    @KafkaListener(topics = "monthly-statement")
    public void listenMonthlyStatement(MonthlyStatementEvent monthlyStatementEvent) {
        try {
            log.info("Got message from monthly-statement topic {}", monthlyStatementEvent);

            MimeMessagePreparator mimeMessagePreparator = mimeMessage -> {
                MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);
                messageHelper.setTo(monthlyStatementEvent.getEmail().toString());
                messageHelper.setSubject(String.format("%s Month Statement", monthlyStatementEvent.getMonth()));
                messageHelper.setText(String.format("""
                                 Hi %s %s,
                                                    \s
                                 We hope you're doing well! Attached, you'll find your monthly statement for %s.
                                 You can review all the transaction details in the attached PDF.
                                                    \s
                                 Best Regards,
                                 SriTel Team.
                                \s""", monthlyStatementEvent.getFirstName(),
                        monthlyStatementEvent.getLastName(),
                        monthlyStatementEvent.getMonth()));

                // Generate PDF statement
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                generatePDFStatement(byteArrayOutputStream, monthlyStatementEvent.getStatementRecords(), monthlyStatementEvent.getMonth().toString());

                // Attach the statement PDF
                messageHelper.addAttachment("Monthly_Statement.pdf", new ByteArrayResource(byteArrayOutputStream.toByteArray()));

            };

            javaMailSender.send(mimeMessagePreparator);
            log.info("Monthly statement email sent");
        } catch (MailException e) {
            log.error("Monthly statement email failed {}", e.getMessage());
            throw new RuntimeException("Monthly statement email failed", e);
        }
    }
}
