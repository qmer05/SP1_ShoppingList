import java.util.Scanner;

public class DataValidator {
    public static int getNumericInput() {
        Scanner scan = new Scanner(System.in);
        try {
            String i = scan.nextLine();
            int j = Integer.parseInt(i);
            return j;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number");
            return getNumericInput();
        }
    }
}
