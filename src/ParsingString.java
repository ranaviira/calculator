import java.util.ArrayList;
import java.util.Stack;

public class ParsingString {

    public static ArrayList<String> parsing(String string) {

        String[] strings = string.split(" ");

        ArrayList<String> arrayList = new ArrayList<>();
        Stack<String> stack = new Stack<>();

        for (String s : strings) {
            if (MathematicalCalculations.isNumber(s)) {
                arrayList.add(s);
            } else {
                if (getPriority(s) >= 1) {
                    while (stack.size() != 0) {
                        if (getPriority(stack.peek()) >= getPriority(s)) {
                            arrayList.add(stack.pop());
                        } else break;
                    }
                }
                stack.push(s);
            }
        }
        while (!stack.empty()) {
            arrayList.add(stack.pop());
        }
        return arrayList;
    }


    private static int getPriority(String string) {
        if (string.equals("*") || (string.equals("/"))) {
            return 2;
        } else if (string.equals("+") || (string.equals("-"))) {
            return 1;
        } else return 0;
    }
}
