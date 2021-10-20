import java.util.ArrayList;
import java.util.Stack;

public class MathematicalCalculations {

    public static double calculation(String s) {
        ArrayList<String> arrayList = ParsingString.parsing(s);
        Stack<Double> stack = new Stack<>();

        for (String string : arrayList) {
            if (isNumber(string)) {
                stack.push(Double.parseDouble(string));
            } else {
                double tmp1 = stack.pop();
                double tmp2 = stack.pop();

                switch (string) {
                    case "+":
                        stack.push(tmp1 + tmp2);
                        break;
                    case "-":
                        stack.push(tmp2 - tmp1);
                        break;
                    case "*":
                        stack.push(tmp1 * tmp2);
                        break;
                    case "/":
                        try {
                            stack.push(tmp2 / tmp1);
                        } catch (ArithmeticException e) {
                            System.out.println("Недопустимая операция, деление на ноль");
                        }


                        break;
                }
            }
        }
        return stack.pop();
    }

    public static boolean isNumber(String string) {
        try {
            Double.parseDouble(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
