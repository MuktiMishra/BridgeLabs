import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A program that finds and prints all multiples of a number below 100.
 * It takes a positive integer from the user and uses a while loop to find the multiples.
 */
public class Q12 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        try {
            // Get input from the user.
            System.out.print("Enter a positive integer to find its multiples (below 100): ");
            int number = scanner.nextInt();

            // Check if the number is a positive integer.
            if (number <= 0) {
                System.out.println("Error: Please enter a positive integer.");
                return;
            }

            System.out.println("Multiples of " + number + " below 100:");

            // Use a while loop to iterate from 1 up to 99.
            int i = 1; // Initialize the counter.
            while (i < 100) {
                // A number 'i' is a multiple of 'number' if 'i' is perfectly divisible by 'number'.
                if (i % number == 0) {
                    System.out.println(i);
                }
                i++; // Increment the counter in each iteration.
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
