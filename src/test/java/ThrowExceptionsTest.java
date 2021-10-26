import com.sun.jdi.request.DuplicateRequestException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThrowExceptionsTest {

    @Test
    @DisplayName("Тест на выбрасывание исключения ArithmeticException(\"Недопустимая операция, деление на ноль\")")
    void testThrowArithmeticException() {
        assertThrows(ArithmeticException.class, () -> MathematicalCalculations.calculation("9 / 0"));
    }

    @Test
    @DisplayName("Тест на выбрасывание исключения Exception(\"Пустая строка\")")
    void testThrowEmptyStringException() {
        assertThrows(Exception.class, () -> ParsingString.parsing(""));
    }

    @Test
    @DisplayName("Тест на выбрасывание исключения IllegalArgumentException(\"В выражении содержатся недопустимые символы\")")
    void testThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> ParsingString.parsing("a + 3 / b"));
    }

    @Test
    @DisplayName("Тест на выбрасывание исключения DuplicateRequestException(\"В выражении содержатся дублирующие символы операций\")")
    void testThrowDuplicateRequestException() {
        assertThrows(DuplicateRequestException.class, () -> ParsingString.parsing("2 ++ 2 -- 3 ** 4 // 2"));
    }

    @Test
    @DisplayName("Тест на выбрасывание исключения Exception(\"В выражении содержатся отрицательные числа\");")
    void testThrowException() {
        assertThrows(Exception.class, () -> ParsingString.parsing("3 + 5 * 4 - -2"));
    }

}