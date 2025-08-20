import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A program that implements the FizzBuzz game.
 * It takes a number from the user and prints "Fizz", "Buzz", or "FizzBuzz"
 * for multiples of 3, 5, or both, respectively.
 */
public class FizzBuzz {

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

            // Loop from 1 up to the entered number.
            for (int i = 1; i <= number; i++) {
                // Use a boolean flag to check if a condition has been met.
                boolean printed = false;
                
                // Check for multiples of 3 and 5 first, as it's the most specific condition.
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                    printed = true;
                } 
                // Then check for multiples of 3.
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                    printed = true;
                }
                // Then check for multiples of 5.
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                    printed = true;
                }
                
                // If no condition was met, print the number itself.
                if (!printed) {
                    System.out.println(i);
                }
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
