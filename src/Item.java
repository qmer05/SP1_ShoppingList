import java.util.ArrayList;
import java.util.Scanner;

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

    public String toString() {
        return "Item: " + itemName + "\tQuantity: " + itemQuantity;
    }
}