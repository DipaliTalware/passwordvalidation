package org.newfische.recapproject;

import java.security.SecureRandom;

public class PasswordGenerator {
    public String createPassword() {
        final String allCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{}|;:'\",.<>?/";
        final String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        final String digits = "0123456789";
        final String specialCharacters = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/";

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        int index = random.nextInt(uppercaseLetters.length());
        password.append(uppercaseLetters.charAt(index));

        index = random.nextInt(lowerCaseLetters.length());
        password.append(lowerCaseLetters.charAt(index));

        index = random.nextInt(digits.length());
        password.append(digits.charAt(index));

        index = random.nextInt(specialCharacters.length());
        password.append(specialCharacters.charAt(index));

        for (int i = 0; i < 4; i++) {
            int newIndex = random.nextInt(allCharacters.length());
            password.append(allCharacters.charAt(newIndex));
        }


        return password.toString();
    }
}
