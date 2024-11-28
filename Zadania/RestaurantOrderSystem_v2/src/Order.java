import java.util.ArrayList;

public class Order {

    // Class representing the entire order

    private ArrayList<OrderItem> items = new ArrayList<>(); // List of items in the order

    // Adds a MenuItem to the order, either updating the quantity of an existing item or adding a new item
    public void addItem(MenuItem menuItem, int quantity) {
        for (OrderItem item : items) {
            if (item.getMenuItem().equals(menuItem)) {
                item.removeQuantity(-quantity);
                return;
            }
        }
        items.add(new OrderItem(menuItem, quantity)); // Adds a new order item if not already present
    }

    // Removes a specific quantity from an item or removes the item entirely
    public void removeItem(int index, int quantityToRemove) {
        OrderItem item = items.get(index - 1);
        if (quantityToRemove >= item.getQuantity()) {
            items.remove(index - 1); // Remove the item
        } else {
            item.removeQuantity(quantityToRemove); // Decrease the quantity without removing the item
        }
    }

    // Displays the entire order, listing items and calculating the total cost
    public void displayOrder() {
        System.out.println("Your order:");
        int count = 1;
        for (OrderItem item : items) {
            System.out.println(count + ". " + item);
            count++;
        }
        double totalCost = items.stream().mapToDouble(OrderItem::getTotalPrice).sum(); // Calculate total cost
        System.out.printf("Total cost: $%.2f", totalCost); // Print total cost in formatted output
        System.out.println();
    }

    // Returns the number of unique items in the order
    public int getItemCount() {
        return items.size();
    }

    // Returns the list of all order items
    public ArrayList<OrderItem> getItems() {
        return items;
    }

}