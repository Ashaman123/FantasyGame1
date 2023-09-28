import java.util.List;
import java.util.ArrayList;

public class InventoryItem {
    private String itemName;
    private int quantity;
    private String description;

    public InventoryItem(String itemName, int quantity, String description) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.description = description;
    }

    // Getters and setters for itemName, quantity, and description (not shown for brevity)

    public static List<InventoryItem> createBaseInventory() {
        List<InventoryItem> inventory = new ArrayList<>();

        inventory.add(new InventoryItem("Health Potion", 5, "Heals character for 50HP"));
        inventory.add(new InventoryItem("Gold Coins", 50, "A coin bearing the face of the land's god"));
        inventory.add(new InventoryItem("Strength Potion", 5, "Gives character the strength of 50 men for three turns!"));

        return inventory;
    }

    public void addToInventory(List<InventoryItem> inventory, String itemName, int quantity, String description) {
        InventoryItem item = new InventoryItem(itemName, quantity, description);
        inventory.add(item);
    }

    public void subtractFromInventory(List<InventoryItem> inventory, String itemName, int quantity) {
        // Create a new list to store items that should be kept
        List<InventoryItem> updatedInventory = new ArrayList<>();

        // Iterate through the inventory and check each item
        for (InventoryItem item : inventory) {
            // If the item name matches and there is enough quantity, subtract the specified quantity
            if (item.getItemName().equals(itemName) && item.getQuantity() >= quantity) {
                item.setQuantity(item.getQuantity() - quantity);

                // If there is still quantity left, keep the item in the updated inventory
                if (item.getQuantity() > 0) {
                    updatedInventory.add(item);
                }
            } else {
                // If the item does not match the criteria, keep it in the updated inventory
                updatedInventory.add(item);
            }
        }

        // Replace the old inventory with the updated one
        inventory.clear();
        inventory.addAll(updatedInventory);
    }
    // Getter for item name
    public String getItemName() {
        return itemName;
    }

    public int setQuantity(int i) {
    	return this.quantity = quantity;
    }
    // Getter for quantity
    public int getQuantity() {
        return quantity;
    }
    

    // Getter for description
    public String getDescription() {
        return description;
    }
}
