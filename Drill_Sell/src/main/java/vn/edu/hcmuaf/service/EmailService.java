package vn.edu.hcmuaf.service;


import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import vn.edu.hcmuaf.mail.MailProperties;

import java.util.Properties;

public class EmailService {

    public final String LINK = "http://localhost:8080/Drill_Sell_war/confirm-account/confirm-account.jsp";
    private Properties prop = new Properties();
    private static EmailService instance;

    {
        prop.put("mail.smtp.host", MailProperties.getHost());
        prop.put("mail.smtp.port", MailProperties.getPort());
        prop.put("mail.smtp.auth", MailProperties.getAuth());
        prop.put("mail.smtp.starttls.enable", MailProperties.getTls());
        prop.put("mail.smtp.socketFactory.port", MailProperties.getPort());
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
    }

    public static EmailService getInstance() {
        if (instance == null) instance = new EmailService();
        return instance;
    }

    public boolean sendMail(String to, String subject, String confirmationCode) {
        Session session = Session.getInstance(prop, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(MailProperties.getUsername(), MailProperties.getPassword());
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(MailProperties.getUsername()));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);

            // Tạo liên kết xác nhận
            message.setText("Đây là mã của bạn để " + subject.toLowerCase() + " :" + confirmationCode);
            String emailContent = "Hãy nhấn vào liên kết sau để" + subject.toLowerCase() + ": "
                    + "<a href=\"" + LINK + "\">Xác nhận đăng ký</a>";

            message.setContent(emailContent, "text/html; charset=utf-8");

            message.setHeader("X-Mailer", "JavaMail API");
            message.setHeader("Content-Type", "text/html; charset=utf-8");

            message.getSentDate();
            // Gửi email
            Transport.send(message);
            System.out.println("Done");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

        return true;
    }

    public boolean vertifyCode(String inputCode, String systemCode) {
        return inputCode.equalsIgnoreCase(systemCode);
    }

    public void main(String[] args) throws MessagingException {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.smtp.socketFactory.port", "465");
//        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        // Tạo đối tượng Authenticator
        String username = "drillsellgroup25@gmail.com";
        String password = "ajkjgjezaadiajtc"; // Replace with your App Password

        Authenticator auth = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        };

        // Tạo đối tượng Session
        Session session = Session.getInstance(props, auth);

        // Tạo đối tượng MimeMessage
        MimeMessage message = new MimeMessage(session);

        // Thiết lập các thuộc tính của MimeMessage
        message.setFrom(new InternetAddress(username));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("ngoctaiphan.cv@gmail.com"));
        message.setSubject("Subject");
        message.setText("Body");

        // Gửi email
        Transport.send(message);
        System.out.println("success");
    }
}

