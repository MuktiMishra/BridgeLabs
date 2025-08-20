import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A program that checks and prints if numbers from 1 to n are odd or even.
 * It takes a positive integer from the user and uses a for loop.
 */
public class Q1 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Prompt the user for an integer.
            System.out.print("Enter a positive integer: ");
            int number = scanner.nextInt();
            
            // Check if the number is a positive integer.
            if (number <= 0) {
                System.out.println("Error: Please enter a positive integer.");
                return;
            }

            // Loop from 1 to the entered number.
            for (int i = 1; i <= number; i++) {
                // The modulo operator (%) returns the remainder of a division.
                // If a number divided by 2 has a remainder of 0, it is even.
                // Otherwise, it is odd.
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
            
        } catch (InputMismatchException e) {
            // Handle the case where the user enters non-integer input.
            System.out.println("Error: Invalid input. Please enter a whole number.");
        } finally {
            // Close the scanner.
            scanner.close();
        }
    }
}
