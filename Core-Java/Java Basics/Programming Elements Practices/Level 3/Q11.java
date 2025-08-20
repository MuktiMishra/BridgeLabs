import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A program that calculates the day of the week for a given date (m, d, y)
 * using the provided Gregorian calendar formulas.
 */
public class DayOfWeek {

    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        try {
            // Get input for month, day, and year.
            System.out.print("Enter month (1-12): ");
            int month = scanner.nextInt();
            System.out.print("Enter day (1-31): ");
            int day = scanner.nextInt();
            System.out.print("Enter year (yyyy): ");
            int year = scanner.nextInt();

            // Validate the input to ensure it's a plausible date.
            if (month < 1 || month > 12 || day < 1 || day > 31 || year < 0) {
                System.out.println("Error: Invalid date entered. Please provide valid month, day, and year.");
                return;
            }

            // A slightly more robust check for day of the month is not included
            // to keep the code focused on the provided formulas.

            // --- Apply the provided formulas for the day of the week ---
            // Formula 1: Calculate y0
            // The formula is y0 = y - (14 - m) / 12 (integer division).
            int y0 = year - (14 - month) / 12;

            // Formula 2: Calculate x
            // The formula is x = y0 + y0/4 - y0/100 + y0/400 (integer division).
            int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

            // Formula 3: Calculate m0
            // The formula is m0 = m + 12 * ((14 - m) / 12) - 2 (integer division).
            int m0 = month + 12 * ((14 - month) / 12) - 2;

            // Formula 4: Calculate d0
            // The formula is d0 = (d + x + 31*m0 / 12) mod 7.
            // Note: The integer division (31*m0 / 12) is performed first.
            int d0 = (day + x + 31 * m0 / 12) % 7;

            // Create a string array to map the result (0-6) to the day of the week.
            String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            
            // Print the final result.
            System.out.println("The day of the week is: " + daysOfWeek[d0]);

        } catch (InputMismatchException e) {
            // Handle the case where the user enters non-numeric input.
            System.out.println("Error: Invalid input. Please enter numbers for the date.");
        } finally {
            // Close the scanner.
            scanner.close();
        }
    }
}
