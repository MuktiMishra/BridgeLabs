import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A program to calculate the power of a number using a for loop.
 * It takes a base number and an exponent from the user and computes the result.
 */
public class Q12 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Get integer input for the base number.
            System.out.print("Enter the base number: ");
            int base = scanner.nextInt();

            // Get integer input for the power (exponent).
            System.out.print("Enter the exponent (power): ");
            int exponent = scanner.nextInt();

            // Check if both numbers are positive integers.
            if (base <= 0 || exponent < 0) {
                System.out.println("Error: Please enter a positive base and a non-negative exponent.");
                return;
            }

            // Initialize the result to 1, as any number to the power of 0 is 1.
            long result = 1;

            // Use a for loop to multiply the base by itself, 'exponent' number of times.
            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }
            
            // Print the final result.
            System.out.printf("%d raised to the power of %d is: %d\n", base, exponent, result);
            
        } catch (InputMismatchException e) {
            // Catch the exception if the user enters non-integer input.
            System.out.println("Error: Invalid input. Please enter whole numbers for the base and exponent.");
        } finally {
            // Close the scanner to prevent resource leaks.
            scanner.close();
        }
    }
}
