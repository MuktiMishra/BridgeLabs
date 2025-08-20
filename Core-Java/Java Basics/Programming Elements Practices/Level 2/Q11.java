import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A program that finds and prints all multiples of a number below 100.
 * It takes a positive integer from the user and uses a for loop to find the multiples.
 */
public class MultiplesFinder {

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

            // Print a heading for the results.
            System.out.println("Multiples of " + number + " below 100:");

            // Use a for loop to iterate from 1 up to 99.
            // A number `i` is a multiple of `number` if `i` is perfectly divisible by `number`.
            for (int i = 1; i < 100; i++) {
                if (i % number == 0) {
                    System.out.println(i);
                }
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
