package edu.icet.ecom.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class PasswordEncryptor {

        public static void main(String[] args) {
            BasicTextEncryptor encryptor = new BasicTextEncryptor();
            encryptor.setPassword("#345891AG"); // same key from UserServiceImpl

            String plainPassword = "admin123"; // your desired password
            String encryptedPassword = encryptor.encrypt(plainPassword);

            System.out.println("Encrypted password: " + encryptedPassword);
        }
    }

