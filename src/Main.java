import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();

        System.out.println("Select an option:");

        Item.displayShoppingList();

        Scanner scan = new Scanner(System.in);

        int userChoice = DataValidator.getNumericInput();

        if (userChoice == 1) {
            String newItem = ItemHandler.itemToAdd();
            int newQuantity = ItemHandler.itemQuantityToAdd();
            Item item1 = new Item(newItem, newQuantity);
            items.add(item1);
            System.out.println("You have added " + newQuantity + " " + newItem + " to the shopping list.");
        }
    }
}