import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationTest {

    @Test
    @DisplayName("Тест метода Validation.checkForValidCharacters()")
    void testCheckForValidCharacters() {
        assertTrue(Validation.checkForValidCharacters("5 + 2 - 6 / 3"));
        assertFalse(Validation.checkForValidCharacters("5 + 2,5 + B - !"));
    }

    @Test
    @DisplayName("Тест метода Validation.checkForDuplicateOperationCharacters()")
    void testCheckForDuplicateOperationCharacters() {
        assertFalse(Validation.checkForDuplicateOperationCharacters("2 + 2 - 6 / 3"));
        assertTrue(Validation.checkForDuplicateOperationCharacters("2 ++ 3 -- 8 ** 4 // 32"));
    }

    @Test
    @DisplayName("Тест метода Validation.checkForMinusNumbers()")
    void testCheckForMinusNumbers() {
        assertTrue(Validation.checkForMinusNumbers("-3"));
        assertTrue(Validation.checkForMinusNumbers("-8.35"));
        assertFalse(Validation.checkForMinusNumbers("12"));
        assertFalse(Validation.checkForMinusNumbers("3.5"));
    }
}