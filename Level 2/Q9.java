import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A program to find the greatest factor of a number, besides the number itself.
 * It takes a positive integer from the user and uses a for loop.
 */
public class Q9 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        try {
            // Get input from the user.
            System.out.print("Enter a positive integer to find its greatest factor: ");
            int number = scanner.nextInt();

            // Check if the number is a positive integer.
            if (number <= 0) {
                System.out.println("Error: Please enter a positive integer.");
                return;
            }

            int greatestFactor = 1; // Initialize the greatest factor to 1.

            // Loop from the number minus one down to 1.
            for (int i = number - 1; i >= 1; i--) {
                // Check if 'number' is perfectly divisible by 'i'.
                if (number % i == 0) {
                    greatestFactor = i; // Assign i to the greatestFactor variable.
                    break; // Exit the loop as soon as the first factor is found.
                }
            }

            System.out.println("The greatest factor of " + number + " is: " + greatestFactor);

        } catch (InputMismatchException e) {
            // Catch the exception if the user enters non-integer input.
            System.out.println("Error: Invalid input. Please enter a whole number.");
        } finally {
            // Close the scanner to prevent resource leaks.
            scanner.close();
        }
    }
}
