public class OrderItem {

    // Class representing an order item (with quantity)

    private MenuItem menuItem;
    private int quantity;

    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public void removeQuantity(int amount) {
        this.quantity -= amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return menuItem.getPrice() * quantity;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    @Override
    public String toString() {
        return menuItem.getName() + " x" + quantity + " - $" + String.format("%.2f", getTotalPrice());
    }

}
