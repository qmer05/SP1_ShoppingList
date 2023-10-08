import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();

        Item item1 = new Item("milk", 2);
        Item item2 = new Item("butter", 5);
        Item item3 = new Item("bread", 1);
        Item item4 = new Item("butter", 10);

        item1.addItem(items);
        item2.addItem(items);
        item3.addItem(items);
        item4.addItem(items);

        for (Item i : items) {
            System.out.println(i);
        }
    }
}