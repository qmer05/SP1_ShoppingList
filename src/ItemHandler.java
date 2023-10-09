import java.util.ArrayList;
import java.util.Scanner;

public class ItemHandler {

    public static String itemToAdd() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the item to add");
        String userInput = scan.nextLine();
        return userInput;
    }

    public static int itemQuantityToAdd(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the quantity to add");
        int userInput = DataValidator.getNumericInput();
        return userInput;
    }

    public static void addItemToList(String addThisItem){
    }
}

