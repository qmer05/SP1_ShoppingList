import java.util.ArrayList;
import java.util.Scanner;

public class ItemHandler {

    public static void itemToAdd() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the item to add");
        String userInput = scan.nextLine();
    }

    public static void itemQuantityToAdd(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the quantity to add");
        int userInput = DataValidator.getNumericInput();
    }

    public static void addItemToList(String addThisItem){
    }
}

