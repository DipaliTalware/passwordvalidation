package org.newfische.recapproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {
    @Test
    void validatePasswordLengthForEmptyPassword(){

//        Given
        String password = "";

//        When
        PasswordValidator pv = new PasswordValidator();
      boolean result =  pv.validatePasswordLength(password);

//        Then
        Assertions.assertFalse(result);
    }

    @Test
    void validatePasswordLengthForNull(){
//        Given
        String password = null;

//        When
        PasswordValidator pv = new PasswordValidator();
        boolean result =  pv.validatePasswordLength(password);

//        Then
        Assertions.assertFalse(result);
    }

    @Test
    void validatePasswordLengthFor8Length(){
//        Given
        String password = "12345678";

//        When
        PasswordValidator pv = new PasswordValidator();
        boolean result =  pv.validatePasswordLength(password);

//        Then
        Assertions.assertTrue(result);
    }

    @Test
    void validatePasswordLengthForMoreThan8Characters(){
//        Given
        String password = "1234567890";

//        When
        PasswordValidator pv = new PasswordValidator();
        boolean result =  pv.validatePasswordLength(password);

//        Then
        Assertions.assertTrue(result);

    }

    @Test
    void validatePasswordLengthForLessThan8Characters(){
//        Given
        String password = "123456";

//        When
        PasswordValidator pv = new PasswordValidator();
        boolean result =  pv.validatePasswordLength(password);

//        Then
        Assertions.assertFalse(result);

    }

    @Test
    void validatePasswordContainsDigitsIfPasswordContainsDigits (){
//        Given
        String password = "abcdw7890";
//        When
        PasswordValidator pv = new PasswordValidator();
        boolean result =  pv.validatePasswordContainsDigits(password);
//        Then
        Assertions.assertTrue(result);
    }

    @Test
    void validatePasswordContainsDigitsIfPasswordContainsNoDigits (){
//        Given
        String password = "abcdwdhds";
//        When
        PasswordValidator pv = new PasswordValidator();
        boolean result =  pv.validatePasswordContainsDigits(password);
//        Then
        Assertions.assertFalse(result);
    }

    @Test
    void validatePasswordContainsDigitsIfPasswordContainsDigitsForEmptyPassword (){
//        Given
        String password = "";
//        When
        PasswordValidator pv = new PasswordValidator();
        boolean result =  pv.validatePasswordContainsDigits(password);
//        Then
        Assertions.assertFalse(result);
    }

    @Test
    void validatePasswordContainsDigitsIfPasswordContainsDigitsForNull (){
//        Given
        String password = null;
//        When
        PasswordValidator pv = new PasswordValidator();
        boolean result =  pv.validatePasswordContainsDigits(password);
//        Then
        Assertions.assertFalse(result);
    }


    @Test
    void validatePasswordCasingIfPasswordContainsLowercaseAndUpperCase (){
//        Given
        String password = "abcdwDFG7890";
//        When
        PasswordValidator pv = new PasswordValidator();
        boolean result =  pv.validatePasswordCasing(password);
//        Then
        Assertions.assertTrue(result);
    }

    @Test
    void validatePasswordCasingForPasswordContainsOnlyLowercase (){
//        Given
        String password = "chch7890";
//        When
        PasswordValidator pv = new PasswordValidator();
        boolean result =  pv.validatePasswordCasing(password);
//        Then
        Assertions.assertFalse(result);
    }

    @Test
    void validatePasswordCasingForPasswordContainsOnlyUppercase (){
//        Given
        String password = "DFG7890";
//        When
        PasswordValidator pv = new PasswordValidator();
        boolean result =  pv.validatePasswordCasing(password);
//        Then
        Assertions.assertFalse(result);
    }

    @Test
    void validatePasswordCasingForPasswordContainsNull (){
//        Given
        String password = null;
//        When
        PasswordValidator pv = new PasswordValidator();
        boolean result =  pv.validatePasswordCasing(password);
//        Then
        Assertions.assertFalse(result);
    }

    @Test
    void validatePasswordCasingForEmptyPassword (){
//        Given
        String password = "";
//        When
        PasswordValidator pv = new PasswordValidator();
        boolean result =  pv.validatePasswordCasing(password);
//        Then
        Assertions.assertFalse(result);
    }

    @Test
    void checkCommonlyUsedPasswordForPassword1(){
//        Given
        String password = "Password1";
//        When
        PasswordValidator pv = new PasswordValidator();
        boolean result = pv.checkCommonlyUsedPassword(password);
//        Then
        Assertions.assertTrue(result);
    }

    @Test
    void checkCommonlyUsedPasswordForAa345678(){
//        Given
        String password = "Aa345678";
//        When
        PasswordValidator pv = new PasswordValidator();
        boolean result = pv.checkCommonlyUsedPassword(password);
//        Then
        Assertions.assertTrue(result);
    }

    @Test
    void checkCommonlyUsedPasswordForNonCommonPassword(){
//        Given
        String password = "hdbheuih134%";
//        When
        PasswordValidator pv = new PasswordValidator();
        boolean result = pv.checkCommonlyUsedPassword(password);
//        Then
        Assertions.assertFalse(result);
    }

    @Test
    void checkCommonlyUsedPasswordForNullPassword(){
//        Given
        String password = null;
//        When
        PasswordValidator pv = new PasswordValidator();
        boolean result = pv.checkCommonlyUsedPassword(password);
//        Then
        Assertions.assertFalse(result);
    }

    @Test
    void checkCommonlyUsedPasswordForEmptylPassword(){
//        Given
        String password = "";
//        When
        PasswordValidator pv = new PasswordValidator();
        boolean result = pv.checkCommonlyUsedPassword(password);
//        Then
        Assertions.assertFalse(result);
    }

    @Test
    void validateSpecialCharactersInPasswordForPositiveTest(){
//        Given
        String password = "chdhu!#@8976FD";
//        When
        PasswordValidator pv = new PasswordValidator();
        boolean result = pv.validateSpecialCharactersInPassword(password);
//        Then
        Assertions.assertTrue(result);
    }

    @Test
    void validateSpecialCharactersInPasswordForNegativeTest(){
//        Given
        String password = "chdhu8976FD";
//        When
        PasswordValidator pv = new PasswordValidator();
        boolean result = pv.validateSpecialCharactersInPassword(password);
//        Then
        Assertions.assertFalse(result);
    }

    @Test
    void validateSpecialCharactersInPasswordForEmptyPassword(){
//        Given
        String password = "";
//        When
        PasswordValidator pv = new PasswordValidator();
        boolean result = pv.validateSpecialCharactersInPassword(password);
//        Then
        Assertions.assertFalse(result);
    }

    @Test
    void validateSpecialCharactersInPasswordForNullPassword(){
//        Given
        String password = null;
//        When
        PasswordValidator pv = new PasswordValidator();
        boolean result = pv.validateSpecialCharactersInPassword(password);
//        Then
        Assertions.assertFalse(result);
    }

}