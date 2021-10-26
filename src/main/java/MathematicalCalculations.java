import java.util.ArrayList;
import java.util.Stack;

public class MathematicalCalculations {

    public static double calculation(String string) throws Exception {

        ArrayList<String> listReversePolishNotation = ParsingString.parsing(string);

        Stack<Double> stackForCalculations = new Stack<>();

        for (String element : listReversePolishNotation) {
            if (CheckStringForNumber.isNumber(element)) {
                stackForCalculations.push(Double.parseDouble(element));
            } else {
                double valueOne = stackForCalculations.pop();
                double valueTwo = stackForCalculations.pop();

                switch (element) {
                    case "+":
                        stackForCalculations.push(valueOne + valueTwo);
                        break;
                    case "-":
                        stackForCalculations.push(valueTwo - valueOne);
                        break;
                    case "*":
                        stackForCalculations.push(valueOne * valueTwo);
                        break;
                    case "/":
                        if (valueOne == 0) {
                             throw new ArithmeticException("Недопустимая операция, деление на ноль");
                        } else {
                            stackForCalculations.push(valueTwo / valueOne);
                        }
                        break;
                }
            }
        }
        return stackForCalculations.pop();
    }
}
