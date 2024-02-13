public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // Initialize the sum to zero
        int sum = 0;

        // Use a for loop to iterate through numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Check if the current number is even
            if (i % 2 == 0) {
                // Add the even number to the sum
                sum += i;
            }
        }

        // Print the sum of even numbers
        System.out.println("The sum of even numbers between 1 and 100 inclusive is: " + sum);
    }
}
