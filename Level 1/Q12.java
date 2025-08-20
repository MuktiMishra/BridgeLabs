import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A program to find the sum of natural numbers using a while loop and a formula.
 * It prompts the user for a natural number, calculates the sum using both methods,
 * and then verifies that the results are the same.
 */
public class Q12 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console.
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Prompt the user for input.
            System.out.print("Please enter a natural number to find its sum: ");
            int n = scanner.nextInt();
            
            // Check if the number is a natural number (a positive integer).
            if (n <= 0) {
                System.out.println("Error: The number you entered is not a natural number. Please enter a positive integer.");
                return;
            }

            // --- Method 1: Sum using a while loop ---
            long sumWhileLoop = 0;
            int currentNumber = 1;
            
            // Loop from 1 up to and including n.
            while (currentNumber <= n) {
                sumWhileLoop += currentNumber;
                currentNumber++;
            }
            
            // --- Method 2: Sum using the formula ---
            // The formula for the sum of the first n natural numbers is n * (n + 1) / 2.
            // We cast n to a long to prevent potential integer overflow for large numbers before the division.
            long sumFormula = (long) n * (n + 1) / 2;
            
            // --- Compare the results ---
            System.out.println("\n--- Results ---");
            System.out.printf("The sum of the first %d natural numbers is:\n", n);
            System.out.printf("Result from the while loop: %d\n", sumWhileLoop);
            System.out.printf("Result from the formula:    %d\n", sumFormula);

            if (sumWhileLoop == sumFormula) {
                System.out.println("\nVerification: The results from both computations are correct!");
            } else {
                System.out.println("\nError: The computed sums do not match. Please check the program logic.");
            }

        } catch (InputMismatchException e) {
            // Catch the exception if the user enters non-integer input.
            System.out.println("Error: Invalid input. Please enter a whole number.");
        } finally {
            // Always close the scanner to prevent resource leaks.
            scanner.close();
        }
    }
}
