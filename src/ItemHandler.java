import java.util.Scanner;

public class ItemHandler {

    public static String addItem() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the item to add");
        String userInput = scan.nextLine();
        return userInput;
    }

    public static int addQuantity(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the quantity to add");
        int userInput = DataValidator.getNumericInput();
        return userInput;
    }

    public static String removeItem(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the item to remove");
        String userInput = scan.nextLine();
        return userInput;
    }

    public static void removeQuantity(){
    }

    public static void addItemToList(String addThisItem){
    }
}

