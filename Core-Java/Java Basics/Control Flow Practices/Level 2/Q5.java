import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A program that implements the FizzBuzz game.
 * It takes a number from the user and prints "Fizz", "Buzz", or "FizzBuzz"
 * for multiples of 3, 5, or both, respectively. This version uses a while loop.
 */
public class Q5 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt for and read the number.
            System.out.print("Enter a positive integer for the FizzBuzz game: ");
            int number = scanner.nextInt();

            // Check for a positive integer.
            if (number <= 0) {
                System.out.println("Error: Please enter a positive integer.");
                return;
            }

            // --- Use a while loop to iterate from 1 up to the entered number. ---
            int i = 1; // Initialize a counter variable

            while (i <= number) {
                // Check for multiples of 3 and 5 first.
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } 
                // Then check for multiples of 3.
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Then check for multiples of 5.
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // If none of the conditions are met, print the number itself.
                else {
                    System.out.println(i);
                }

                i++; // Increment the counter
            }
            
        } catch (InputMismatchException e) {
            // Catch the exception if the user enters non-integer input.
            System.out.println("Error: Invalid input. Please enter a whole number.");
        } finally {
            // Always close the scanner.
            scanner.close();
        }
    }
}
