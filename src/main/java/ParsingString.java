import com.sun.jdi.request.DuplicateRequestException;

import java.util.ArrayList;
import java.util.Stack;

public class ParsingString {

    public static ArrayList<String> parsing(String string) throws Exception {

        if(string.isEmpty()){
            throw new Exception("Пустая строка");
        }

        if (!(Validation.checkForValidCharacters(string))) {
            throw new IllegalArgumentException("В выражении содержатся недопустимые символы");
        }

        if (Validation.checkForDuplicateOperationCharacters(string)) {
            throw new DuplicateRequestException("В выражении содержатся дублирующие символы операций");
        }

        if (Validation.checkForMinusNumbers(string)) {
            throw new Exception("В выражении содержатся отрицательные числа");
        }

        String[] arrayNumbersAndOperators = string.split(" ");

        ArrayList<String> arrayForNumbers = new ArrayList<>();
        Stack<String> stackForOperators = new Stack<>();

        for (String element : arrayNumbersAndOperators) {
            if (CheckStringForNumber.isNumber(element)) {
                arrayForNumbers.add(element);
            } else {
                if (Operator.getPriority(element) >= 1) {
                    while (stackForOperators.size() != 0) {
                        if (Operator.getPriority(stackForOperators.peek()) >= Operator.getPriority(element)) {
                            arrayForNumbers.add(stackForOperators.pop());
                        } else break;
                    }
                }
                stackForOperators.push(element);
            }
        }
        while (!stackForOperators.empty()) {
            arrayForNumbers.add(stackForOperators.pop());
        }
        return arrayForNumbers;
    }

}
