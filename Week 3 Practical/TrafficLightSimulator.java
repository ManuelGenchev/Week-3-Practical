import java.util.Scanner;

public class TrafficLightSimulator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for the traffic light color
        System.out.print("Enter the color of the traffic light (red, yellow, green): ");
        String color = scanner.nextLine().toLowerCase(); // Convert input to lowercase for case-insensitivity

        // Use a switch statement to determine the action based on the color
        String action = "";
        switch (color) {
            case "red":
                action = "Stop";
                break;
            case "yellow":
                action = "Ready to go";
                break;
            case "green":
                action = "Go";
                break;
            default:
                action = "Invalid color input";
                break;
        }

        // Print the result
        System.out.println("The traffic light is " + color + " - " + action);

        // Close the Scanner
        scanner.close();
    }
}