import java.util.LinkedHashMap;

public class MenuCategory {

    // Class representing a menu category

    private String name;
    private LinkedHashMap<Integer, MenuItem> items = new LinkedHashMap<>(); // Stores menu items with their IDs

    public MenuCategory(String name) {
        this.name = name; // Sets the name of the menu category
    }

    public void addItem(MenuItem item) {
        items.put(items.size() + 1, item); // Adds a new item to the category and assigns it a unique ID
    }

    public MenuItem getItem(int id) {
        return items.get(id); // Retrieves an item by its ID
    }

    public boolean containsItem(int id) {
        return items.containsKey(id); // Checks if the category contains an item with the specified ID
    }

    public void displayCategory() { // Displays the category name and all items within it
        System.out.println("Category: " + name);
        for (int key : items.keySet()) { // Iterates through and prints each item with its corresponding ID
            System.out.println(key + ". " + items.get(key));
        }
        System.out.println("Enter the number of the item to add to your order, or 0 to go back.");
    }

}
