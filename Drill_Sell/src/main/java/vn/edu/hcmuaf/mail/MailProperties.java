package vn.edu.hcmuaf.mail;

import java.io.IOException;
import java.util.Properties;

public class MailProperties {
    static Properties prop = new Properties();

    static {
        try {
            prop.load(MailProperties.class.getClassLoader().getResourceAsStream("mail.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getHost() {
        return prop.getProperty("mail.smtp.host");
    }

    public static String getPort() {
        return prop.getProperty("mail.smtp.port");
    }


    public static String getUsername() {
        return prop.getProperty("mail.user");
    }

    public static String getPassword() {
        return prop.getProperty("mail.pass");
    }


    public static boolean getAuth() {
        return "true".equals(prop.getProperty("mail.smtp.auth"));
    }

    public static boolean getTls() {
        return "true".equals(prop.getProperty("mail.smtp.starttls.enable"));
    }
//    poia peru zqds apnv
}

