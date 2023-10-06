import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Item> items = new ArrayList<>();
        Item item1 = new Item("milk",3);
        Item item2 = new Item("bread",2);
        Item item3 = new Item("butter",4);
        items.add(item1);
        items.add(item2);
        items.add(item3);

        for (int i = 0; i < items.size(); i++){
        System.out.println(items.get(i).getItemName() + items.get(i).getItemQuantity());
        }
    }
}
