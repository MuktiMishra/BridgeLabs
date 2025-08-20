import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A program to check if a year is a leap year based on Gregorian calendar rules.
 * It includes two methods for checking: one with multiple if-else statements
 * and another with a single if statement using logical operators.
 */
public class Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a year: ");
            int year = scanner.nextInt();

            // Check if the year is valid for the Gregorian calendar.
            if (year < 1582) {
                System.out.println("Error: The program only works for years after 1581 (Gregorian calendar).");
                return;
            }

            System.out.println("\n--- Using Multiple If-Else Statements ---");
            checkLeapYearMultipleIfElse(year);

            System.out.println("\n--- Using a Single If Statement with Logical Operators ---");
            checkLeapYearSingleIf(year);

        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a valid year (a whole number).");
        } finally {
            scanner.close();
        }
    }

    /**
     * Checks if a year is a leap year using multiple if-else statements.
     * @param year The year to check.
     */
    public static void checkLeapYearMultipleIfElse(int year) {
        // The most specific condition (divisible by 400) comes first.
        if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year.");
        } 
        // Then, check for years divisible by 100.
        else if (year % 100 == 0) {
            System.out.println(year + " is not a Leap Year.");
        } 
        // Finally, check for years divisible by 4.
        else if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year.");
        } 
        // If none of the above conditions are met.
        else {
            System.out.println(year + " is not a Leap Year.");
        }
    }

    /**
     * Checks if a year is a leap year using a single if statement with logical operators.
     * @param year The year to check.
     */
    public static void checkLeapYearSingleIf(int year) {
        // A year is a leap year if it's divisible by 4 AND (not divisible by 100 OR divisible by 400).
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
