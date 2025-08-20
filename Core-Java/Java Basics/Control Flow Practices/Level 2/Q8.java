import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A program to find and print the factors of a positive integer entered by the user.
 * It uses a while loop to check for divisibility from 1 up to the number itself.
 */
public class Q8 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        try {
            // Get input from the user.
            System.out.print("Enter a positive integer to find its factors: ");
            int number = scanner.nextInt();

            // Check if the number is a positive integer.
            if (number <= 0) {
                System.out.println("Error: Please enter a positive integer.");
                return;
            }

            System.out.println("The factors of " + number + " are:");

            // Use a while loop to iterate from 1 up to the number.
            int i = 1; // Initialize the counter
            while (i <= number) {
                // Check if 'number' is perfectly divisible by 'i'.
                // The modulo operator (%) returns the remainder of a division.
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++; // Increment the counter in each iteration
            }

        } catch (InputMismatchException e) {
            // Catch the exception if the user enters non-integer input.
            System.out.println("Error: Invalid input. Please enter a whole number.");
        } finally {
            // Close the scanner to prevent resource leaks.
            scanner.close();
        }
    }
}
