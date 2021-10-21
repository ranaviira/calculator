public class Operator {

    public static int getPriority(String string) {

        if (string.equals("*") || string.equals("/")) {
            return 2;
        } else if (string.equals("+") || string.equals("-")) {
            return 1;
        } else {
            return 0;
        }
    }
}
