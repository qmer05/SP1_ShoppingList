import java.util.ArrayList;

public class Item {
    private String itemName;
    private int itemQuantity;

    public Item(String itemName, int itemQuantity) {
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemName(String newItemName) {
        this.itemName = newItemName;
    }

    public void setItemQuantity(int newItemQuantity) {
        this.itemQuantity = newItemQuantity;
    }

    public void addItem(ArrayList<Item> newItemToAdd) {
        for (Item item : newItemToAdd) {
            if (item.itemName.equals(this.itemName)) {
                System.out.println("This item is already on the list");
                return;
            }
        }
        newItemToAdd.add(this);
    }

    public String toString() {
        return "Item: " + itemName + "\tQuantity: " + itemQuantity;
    }
}