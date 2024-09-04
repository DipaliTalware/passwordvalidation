package org.newfische.recapproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {
@Test
    void generatePasswordCreatesWithAllCriteria() {
//    Given
    PasswordGenerator generator = new PasswordGenerator();
//    When
    String password = generator.createPassword();
//    Then
    PasswordValidator validator = new PasswordValidator();
    boolean result = validator.validatePasswordCasing(password);
    Assertions.assertTrue(result);

    result = validator.validatePasswordLength(password);
    Assertions.assertTrue(result);

    result = validator.validatePasswordContainsDigits(password);
    Assertions.assertTrue(result);

    result = validator.validateSpecialCharactersInPassword(password);
    Assertions.assertTrue(result);

    result = validator.checkCommonlyUsedPassword(password);
    Assertions.assertFalse(result);

}
}