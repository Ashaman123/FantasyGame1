public class InventoryItem {
    private String name;
    private int amount;

    public InventoryItem(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    // You can add more methods or customize this class as needed
}
