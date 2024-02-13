import java.util.Scanner;

class CountOddNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of integers with the specified size
        int[] numbers = new int[size];

        // Get user input for the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Initialize the count of odd numbers to zero
        int oddCount = 0;

        // Use a for loop to iterate through the array and count odd numbers
        for (int i = 0; i < size; i++) {
            // Check if the current number is odd
            if (numbers[i] % 2 != 0) {
                // Increment the count of odd numbers
                oddCount++;
            }
        }

        // Print the count of odd numbers
        System.out.println("The number of odd numbers in the array is: " + oddCount);

        // Close the Scanner
        scanner.close();
    }
}
