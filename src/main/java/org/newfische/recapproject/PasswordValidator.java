package org.newfische.recapproject;

public class PasswordValidator {
    public static void main(String[] args) {
        System.out.println("Hello world!!!");
    }

    public boolean validatePasswordLength(String password) {
        return null != password && password.length() >= 8;
    }

    public boolean validatePasswordContainsDigits(String password) {
        return password !=null && password.matches(".*\\d.*");
    }

    public boolean validatePasswordCasing(String password) {
        return password != null && password.matches(".*[a-z].*") && password.matches(".*[A-Z].*");
    }

    public boolean checkCommonlyUsedPassword(String password) {
        return password!= null && (password.equals("Password1") || password.equals("Aa345678"));
    }

    public boolean validateSpecialCharactersInPassword(String password) {
        return password != null && password.matches(".*[^a-zA-Z0-9 ].*");
    }
}