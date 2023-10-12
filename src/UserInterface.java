import java.util.Scanner;

public class UserInterface {

    public static void returnToDisplayMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type x to return to options menu");
        String userInput = scan.nextLine();
        if (userInput.equals("x")) {
            displayShoppingList();
        }
    }

    public static void displayShoppingList() {
        System.out.println("1) Add item");
        System.out.println("2) Remove item");
        System.out.println("3) Show items");
    }

    public static int userInputMenu() {
        Scanner scan = new Scanner(System.in);
        int userChoice = DataValidator.getNumericInput();
        return userChoice;
    }

    public static void optionsChoice() {
        }
    }


