import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();

        System.out.println("Select an option:");

        UserInterface.displayShoppingList();

        int userChoice = UserInterface.userInputMenu();

        if (userChoice == 1) {
            String newItem = ItemHandler.addItem();
            int newQuantity = ItemHandler.addQuantity();
            Item item1 = new Item(newItem, newQuantity);
            items.add(item1);
            System.out.println("You have added " + newQuantity + " " + newItem + " to the shopping list.");
            UserInterface.returnToDisplayMenu();
        } else if (userChoice == 2) {
            String oldItem = ItemHandler.removeItem();
        } else if (userChoice == 3){
            System.out.println(items);
        }
    }
}