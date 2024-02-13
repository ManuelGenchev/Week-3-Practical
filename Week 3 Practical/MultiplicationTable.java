import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for the number
        System.out.print("Enter the number for multiplication table: ");
        int n = scanner.nextInt();

        // Print the multiplication table using a for loop
        System.out.println("Multiplication table for " + n + ":");
        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }

        // Close the Scanner
        scanner.close();
    }
}
