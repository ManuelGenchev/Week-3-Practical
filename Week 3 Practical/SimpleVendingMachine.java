import java.util.Scanner;

public class SimpleVendingMachine {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Display menu
        System.out.println("Vending Machine Menu:");
        System.out.println("1. Water - $1.00");
        System.out.println("2. Soda - $1.50");
        System.out.println("3. Chocolate - $2.00");
        System.out.println("4. Chips - $1.75");
        System.out.println("5. Exit");

        // Get user input for the selected item
        System.out.print("Enter the number of the item you want to purchase (or enter 5 to exit): ");
        int selectedItem = scanner.nextInt();

        // Use a switch statement to determine the item name and price based on the user's selection
        String itemName = "";
        double itemPrice = 0.0;

        switch (selectedItem) {
            case 1:
                itemName = "Water";
                itemPrice = 1.00;
                break;
            case 2:
                itemName = "Soda";
                itemPrice = 1.50;
                break;
            case 3:
                itemName = "Chocolate";
                itemPrice = 2.00;
                break;
            case 4:
                itemName = "Chips";
                itemPrice = 1.75;
                break;
            case 5:
                System.out.println("Exiting the vending machine. Thank you!");
                // Close the Scanner
                scanner.close();
                return;
            default:
                System.out.println("Invalid selection. Please choose a valid item.");
                // Close the Scanner
                scanner.close();
                return;
        }

        // Print the result
        System.out.println("You selected: " + itemName);
        System.out.println("Price: $" + itemPrice);

        // Close the Scanner
        scanner.close();
    }
}
