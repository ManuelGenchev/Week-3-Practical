import java.util.Scanner;

public class MonthToSeasonConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for the month
        System.out.print("Enter the name of the month: ");
        String month = scanner.nextLine().toLowerCase(); // Convert input to lowercase for case-insensitivity

        // Use a switch statement to determine the season based on the month
        String season = "";
        switch (month) {
            case "december":
            case "january":
            case "february":
                season = "Winter";
                break;
            case "march":
            case "april":
            case "may":
                season = "Spring";
                break;
            case "june":
            case "july":
            case "august":
                season = "Summer";
                break;
            case "september":
            case "october":
            case "november":
                season = "Autumn";
                break;
            default:
                System.out.println("Invalid month input");
                // Close the Scanner
                scanner.close();
                return;
        }

        // Print the result
        System.out.println("The season for " + month + " is " + season);

        // Close the Scanner
        scanner.close();
    }
}