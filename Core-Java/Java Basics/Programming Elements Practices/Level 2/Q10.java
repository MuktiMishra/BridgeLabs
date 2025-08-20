import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A program to find the greatest factor of a number, besides the number itself.
 * It takes a positive integer from the user and uses a while loop.
 */
public class Q10 {

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
            int counter = number - 1; // Start the counter from number - 1.

            // Use a while loop to iterate from number - 1 down to 1.
            while (counter >= 1) {
                // Check if 'number' is perfectly divisible by the 'counter'.
                if (number % counter == 0) {
                    greatestFactor = counter; // Assign the counter to the greatestFactor variable.
                    break; // Exit the loop as soon as the first factor is found.
                }
                counter--; // Decrement the counter in each iteration.
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
