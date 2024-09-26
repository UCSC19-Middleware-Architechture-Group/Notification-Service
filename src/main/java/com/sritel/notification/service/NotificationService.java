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

import static com.sritel.notification.service.GeneratePdf.generatePDFStatement;

@Service
@RequiredArgsConstructor
@Slf4j
public class NotificationService {
    private final JavaMailSender javaMailSender;

    @KafkaListener(topics = "monthly-statement")
    public void listen(MonthlyStatementEvent monthlyStatementEvent) {
        try {
            log.info("Got message from monthly-statement topic {}", monthlyStatementEvent);

            MimeMessagePreparator mimeMessagePreparator = mimeMessage -> {
                MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);
                messageHelper.setTo(monthlyStatementEvent.getEmail().toString());
                messageHelper.setSubject(String.format("%s Month Statement", monthlyStatementEvent.getMonth()));
                messageHelper.setText(String.format("""
                        Hi %s %s,
                                            
                        Your monthly statement.
                                            
                        Best Regards,
                        Sri Tel.
                        """, monthlyStatementEvent.getFirstName().toString(), monthlyStatementEvent.getLastName().toString()));

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
