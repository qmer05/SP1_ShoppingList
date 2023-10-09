import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();

        System.out.println("Select an option:");

        Item.displayShoppingList();

        Scanner scan = new Scanner(System.in);

        int userChoice = Item.getNumericInput();

        }
    }