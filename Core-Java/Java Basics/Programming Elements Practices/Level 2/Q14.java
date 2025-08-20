import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A program to calculate the power of a number using a while loop.
 * It takes a base number and an exponent from the user and computes the result.
 */
public class PowerCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Get integer input for the base number.
            System.out.print("Enter the base number: ");
            int number = scanner.nextInt();

            // Get integer input for the power (exponent).
            System.out.print("Enter the exponent (power): ");
            int power = scanner.nextInt();

            // Check for a non-negative exponent.
            if (power < 0) {
                System.out.println("Error: Please enter a non-negative exponent.");
                return;
            }

            // Initialize the result to 1.
            long result = 1;
            // Initialize a counter.
            int counter = 0;

            // Use a while loop to multiply the base by itself, 'power' number of times.
            while (counter < power) {
                result *= number;
                counter++; // Increment the counter in each iteration.
            }
            
            // Print the final result.
            System.out.printf("%d raised to the power of %d is: %d\n", number, power, result);
            
        } catch (InputMismatchException e) {
            // Catch the exception if the user enters non-integer input.
            System.out.println("Error: Invalid input. Please enter whole numbers for the base and exponent.");
        } finally {
            // Close the scanner to prevent resource leaks.
            scanner.close();
        }
    }
}
