import java.util.Scanner;


public class WorkWithConsole {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение через пробел:");
        String addPoint = scanner.nextLine();


        System.out.println(MathematicalCalculations.calculation(addPoint));
        //System.out.println(ParsingString.parsing(addPoint));


    }
}
