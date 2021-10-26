import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckStringForNumberTest {

    @Test
    @DisplayName("Тест метода CheckStringForNumber.isNumber(String string)")
    void testIsNumber() {
        assertTrue(CheckStringForNumber.isNumber("6.1"));
        assertTrue(CheckStringForNumber.isNumber("9"));
        assertFalse(CheckStringForNumber.isNumber("seven"));
        assertFalse(CheckStringForNumber.isNumber("+"));
        assertFalse(CheckStringForNumber.isNumber(" "));
    }
}