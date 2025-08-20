import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A program to compute the factorial of a non-negative integer.
 * It takes a number from the user and calculates the factorial using a for loop.
 */
public class Q15 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user for an integer.
            System.out.print("Please enter a non-negative integer to find its factorial: ");
            int n = scanner.nextInt();

            // Check if the number is a positive integer or zero, as factorial is defined for these.
            if (n < 0) {
                System.out.println("Error: Factorial is not defined for negative numbers. Please enter a non-negative integer.");
                return;
            }

            // --- Compute the factorial using a for loop ---
            long factorial = 1;

            // Loop from 1 up to and including n.
            // The for loop is ideal for this since we know exactly how many iterations we need.
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            
            // Print the final result.
            System.out.printf("The factorial of %d is: %d\n", n, factorial);

        } catch (InputMismatchException e) {
            // Catch the exception if the user enters non-integer input.
            System.out.println("Error: Invalid input. Please enter a whole number.");
        } finally {
            // Close the scanner to prevent resource leaks.
            scanner.close();
        }
    }
}
