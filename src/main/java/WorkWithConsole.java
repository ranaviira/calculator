import java.util.Scanner;

public class WorkWithConsole {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение через пробел: ");
        String addPoint = scanner.nextLine();

        System.out.println("Результат " + MathematicalCalculations.calculation(addPoint));
    }

}
