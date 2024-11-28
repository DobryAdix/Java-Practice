import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LinkedHashMap<Integer, MenuCategory> menuCategories = setupMenu();
        Order order = new Order();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Restaurant Ordering System!");

        handleOrdering(menuCategories, order, scanner);  // Handles the ordering process
        finalizeOrder(order, scanner, menuCategories);   // Finalizes the order process

        scanner.close();
    }

    // Creates and initializes the menu categories and items
    private static LinkedHashMap<Integer, MenuCategory> setupMenu() {
        MenuCategory food = new MenuCategory("Food");
        food.addItem(new MenuItem("Burger", 5.99));
        food.addItem(new MenuItem("Pizza", 8.99));
        food.addItem(new MenuItem("Salad", 4.99));

        MenuCategory drinks = new MenuCategory("Drinks");
        drinks.addItem(new MenuItem("Cola", 1.99));
        drinks.addItem(new MenuItem("Water", 0.99));
        drinks.addItem(new MenuItem("Juice", 2.49));

        LinkedHashMap<Integer, MenuCategory> menuCategories = new LinkedHashMap<>();
        menuCategories.put(1, food);
        menuCategories.put(2, drinks);

        return menuCategories;
    }

    // Main loop to handle ordering - allows users to choose categories and add items
    private static void handleOrdering(LinkedHashMap<Integer, MenuCategory> menuCategories, Order order, Scanner scanner) {
        while (true) {
            System.out.println("Choose a category:");
            System.out.println("1. Food");
            System.out.println("2. Drinks");
            System.out.println("0. Finish order");

            int categoryChoice = getValidInteger(scanner);  // Ensures input is a valid integer
            if (categoryChoice == 0) break;  // Exits ordering if the user selects "Finish order"

            if (menuCategories.containsKey(categoryChoice)) {
                processCategory(menuCategories.get(categoryChoice), order, scanner);  // Processes the selected category
            } else {
                System.out.println("Invalid category number. Please try again.");
            }
        }
    }

    // Processes a specific category, allowing the user to add items
    private static void processCategory(MenuCategory category, Order order, Scanner scanner) {
        while (true) {
            category.displayCategory();  // Displays the items in the selected category

            int itemChoice = getValidInteger(scanner);  // Ensures input is a valid integer
            if (itemChoice == 0) break;  // Returns to category selection if the user selects 0

            if (category.containsItem(itemChoice)) {
                processItem(category.getItem(itemChoice), order, scanner);  // Processes the selected item
            } else {
                System.out.println("Invalid item number. Please try again.");
            }
        }
    }

    // Adds the selected item to the order, asking for the quantity
    private static void processItem(MenuItem item, Order order, Scanner scanner) {
        System.out.println("How many " + item.getName() + " would you like?");
        int quantity = getValidInteger(scanner);  // Ensures input is a valid integer

        if (quantity > 0) {
            order.addItem(item, quantity);  // Adds the specified quantity of the item to the order
            System.out.println(item.getName() + " x" + quantity + " added to your order.");
        } else {
            System.out.println("Quantity must be greater than 0. Please try again.");
        }
    }

    // Finalizes the order, allowing users to confirm, modify, or return to the menu
    private static void finalizeOrder(Order order, Scanner scanner, LinkedHashMap<Integer, MenuCategory> menuCategories) {
        while (true) {
            System.out.println("Finalizing your order...");
            order.displayOrder();  // Displays the current order summary

            if (order.getItemCount() == 0) {  // Checks if the order is empty
                System.out.println("Your order is empty. Thank you for visiting!");
                break;
            }

            System.out.println("Enter '1' to confirm your order, '2' to remove items, or '0' to go back:");
            String actionInput = scanner.nextLine();

            if (actionInput.equals("1")) {
                System.out.println("Thank you for your order!");  // Confirms the order
                break;
            } else if (actionInput.equals("2")) {
                removeItemFromOrder(order, scanner);  // Removes items from the order
            } else if (actionInput.equals("0")) {
                System.out.println("Returning to the menu...");
                handleOrdering(menuCategories, order, scanner);  // Returns to the ordering menu
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }

    // Allows the user to remove specific items or quantities from the order
    private static void removeItemFromOrder(Order order, Scanner scanner) {
        System.out.println("Which item would you like to remove? Enter the number (1-" + order.getItemCount() + "):");
        int removeChoice = getValidInteger(scanner);  // Ensures input is a valid integer

        if (removeChoice < 1 || removeChoice > order.getItemCount()) {
            System.out.println("Invalid item number. Please try again.");
            return;
        }

        System.out.println("How many would you like to remove?");
        int quantityToRemove = getValidInteger(scanner);  // Ensures input is a valid integer

        int currentItemQuantity = order.getItems().get(removeChoice - 1).getQuantity();
        if (quantityToRemove > 0 && quantityToRemove <= currentItemQuantity) {
            order.removeItem(removeChoice, quantityToRemove);  // Removes the specified quantity from the order
        } else {
            System.out.println("Quantity must be between 1 and the current quantity of the selected item. Please try again.");
        }
    }

    // Validates user input to ensure it's an integer
    private static int getValidInteger(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input);  // Tries to parse the input as an integer
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

}
