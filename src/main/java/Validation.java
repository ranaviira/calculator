public class Validation {

    static boolean checkForValidCharacters(String string) {
        String validCharacters = " 0123456789.-+/*";
        for (int i = 0; i < string.length(); i++) {
            if (validCharacters.contains(String.valueOf(string.charAt(i)))) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    static boolean checkForDuplicateOperationCharacters(String string) {
        return (string.contains("++") || (string.contains("--") || (string.contains("**") || (string.contains("//")))));
    }

    static boolean checkForMinusNumbers(String string) {
        return string.matches("(.*)(-\\d)(.*)");
    }
}
