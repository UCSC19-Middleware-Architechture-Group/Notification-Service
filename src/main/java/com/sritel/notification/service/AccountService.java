package com.sritel.notification.service;

import com.sritel.account.event.AccountEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class AccountService {
    private final JavaMailSender javaMailSender;

    @KafkaListener(topics = "create-account")
    public void listenCreateAccount(AccountEvent accountEvent) {
        try {
            log.info("Got message from create-account topic {}", accountEvent);

            MimeMessagePreparator mimeMessagePreparator = mimeMessage -> {
                MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage);
                messageHelper.setTo(accountEvent.getEmail().toString());
                messageHelper.setSubject("Account Created Successfully!");
                messageHelper.setText(String.format("""
                                 Dear Customer,
                                                        \s
                                 We are excited to inform you that your account has been successfully created.
                                 Account Details:
                                     - Account ID: %s
                                     - Email: %s
                                     - Phone Number: %s
                                     - Created Date: %s
                                                        \s
                                 Thank you for choosing our services!
                                                        \s
                                 Best regards,
                                 SriTel Team.
                                \s""", accountEvent.getId().toString(),
                        accountEvent.getEmail().toString(),
                        accountEvent.getPhoneNo().toString(),
                        accountEvent.getCreatedDate().toString()));
            };

            javaMailSender.send(mimeMessagePreparator);
            log.info("Account created email sent");
        } catch (MailException e) {
            log.error("Account created email failed {}", e.getMessage());
            throw new RuntimeException("Account created email failed", e);
        }
    }

    @KafkaListener(topics = "delete-account")
    public void listenDeleteAccount(AccountEvent accountEvent) {
        try {
            log.info("Got message from delete-account topic {}", accountEvent);

            MimeMessagePreparator mimeMessagePreparator = mimeMessage -> {
                MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage);
                messageHelper.setTo(accountEvent.getEmail().toString());
                messageHelper.setSubject("Account Deactivated");
                messageHelper.setText(String.format("""
                                 Dear Customer,
                                                        \s
                                 We regret to inform you that your account has been deleted.
                                 Account Details:
                                     - Account ID: %s
                                     - Email: %s
                                     - Phone Number: %s
                                     - Deleted Date: %s
                                                        \s
                                 If you have any questions or concerns, please contact our support team.
                                                        \s
                                 Best regards,
                                 SriTel Team.
                                \s""", accountEvent.getId().toString(),
                        accountEvent.getEmail().toString(),
                        accountEvent.getPhoneNo().toString(),
                        accountEvent.getCreatedDate().toString()));
            };

            javaMailSender.send(mimeMessagePreparator);
            log.info("Account delete email sent");
        } catch (MailException e) {
            log.error("Account delete email failed {}", e.getMessage());
            throw new RuntimeException("Account delete email failed", e);
        }
    }

}
