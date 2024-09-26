package com.sritel.notification.service;

import com.sritel.provisioning.event.ServiceEvent;
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
public class ProvisioningService {
    private final JavaMailSender javaMailSender;

    @KafkaListener(topics = "activate-service")
    public void listenServiceActivation(ServiceEvent serviceEvent) {
        try {
            log.info("Got message from activate-service topic {}", serviceEvent);

            MimeMessagePreparator mimeMessagePreparator = mimeMessage -> {
                MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage);
                messageHelper.setTo(serviceEvent.getEmail().toString());
                messageHelper.setSubject("Service Activation Confirmation");
                messageHelper.setText(String.format("""
                                 Dear Customer,
                                                    \s
                                 We are pleased to inform you that your service has been successfully activated.
                                                    \s
                                 Service Details:
                                     - Service ID: %s
                                     - Service Name: %s
                                     - Service Type: %s
                                     - Service Category: %s
                                     - Service Description: %s
                                     - Activation Date: %s
                                     - Status: %s
                                     - Service Charge: %.2f
                                                    \s
                                 Thank you for choosing SriTel for your service needs. If you have any questions or require further assistance, feel free to contact us.
                                                    \s
                                 Best regards,
                                 SriTel Team.
                                \s""",
                        serviceEvent.getServiceId().toString(),
                        serviceEvent.getServiceName().toString(),
                        serviceEvent.getServiceType().toString(),
                        serviceEvent.getServiceCategory().toString(),
                        serviceEvent.getServiceDescription().toString(),
                        serviceEvent.getActivationDate().toString(),
                        serviceEvent.getStatus().toString(),
                        serviceEvent.getServiceCharge()));
            };

            javaMailSender.send(mimeMessagePreparator);
            log.info("Service activation email sent");
        } catch (MailException e) {
            log.error("Service activation email failed {}", e.getMessage());
            throw new RuntimeException("Service activation email failed", e);
        }
    }

    @KafkaListener(topics = "deactivate-service")
    public void listenServiceDeactivation(ServiceEvent serviceEvent) {
        try {
            log.info("Got message from deactivate-service topic {}", serviceEvent);

            MimeMessagePreparator mimeMessagePreparator = mimeMessage -> {
                MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage);
                messageHelper.setTo(serviceEvent.getEmail().toString());
                messageHelper.setSubject("Service Deactivation Notification");
                messageHelper.setText(String.format("""
                                 Dear Customer,
                                                    \s
                                 We regret to inform you that your service has been deactivated.
                                                    \s
                                 Service Details:
                                     - Service ID: %s
                                     - Service Name: %s
                                     - Service Type: %s
                                     - Service Category: %s
                                     - Service Description: %s
                                     - Deactivation Date: %s
                                     - Status: %s
                                                    \s
                                 If you believe this is an error or need further assistance, please contact us as soon as possible.
                                                    \s
                                 Best regards,
                                 SriTel Team.
                                \s""",
                        serviceEvent.getServiceId().toString(),
                        serviceEvent.getServiceName().toString(),
                        serviceEvent.getServiceType().toString(),
                        serviceEvent.getServiceCategory().toString(),
                        serviceEvent.getServiceDescription().toString(),
                        serviceEvent.getActivationDate().toString(),
                        serviceEvent.getStatus().toString()));
            };

            javaMailSender.send(mimeMessagePreparator);
            log.info("Service deactivation email sent");
        } catch (MailException e) {
            log.error("Service deactivation email failed {}", e.getMessage());
            throw new RuntimeException("Service deactivation email failed", e);
        }
    }


}
