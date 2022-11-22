package com.example.package_delivery.utils;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendMail {
    public static void sendMail(String recipient, String messageSent) throws Exception {
        Properties properties = new Properties();

        properties.setProperty("mail.smtp.starttls.enable", "true");
        properties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String myAccount = "gliouinemahdi@gmail.com";
        String password = "rmcfyyrayevkizym";

        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccount, password);
            }
        });

        Message message = prepareMessage(session, myAccount, recipient, messageSent);
        Transport.send(message);
    }

    private static Message prepareMessage(Session session, String myAccountEmail, String recipient, String messageSent) {
        Message message = new MimeMessage(session);
        try {
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
            message.setSubject("A new delivery is available");
            message.setText(messageSent);
            return message;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
