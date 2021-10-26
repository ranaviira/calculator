import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MathematicalCalculationsTest {

    @ParameterizedTest
    @DisplayName("Тест на выполнение арифметических операций (сложение, вычитание, деление, умножение)")
    @ValueSource(doubles = {2.5 + 7.4, 5 - 3, 3 * 3, 9 / 3})
    void testCheckingArithmeticOperations(double inputParameter) throws Exception {
        String expression = String.valueOf(inputParameter);
        assertEquals(inputParameter, MathematicalCalculations.calculation(expression));
    }

    @Test
    @DisplayName("Тест на выполнение выражения \"10 + 16.5 - 9 * 4.2 / 6.3\"")
    void testExpression() throws Exception {
        assertEquals(20.5, MathematicalCalculations.calculation("10 + 16.5 - 9 * 4.2 / 6.3"));
    }
}