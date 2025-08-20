import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A program to count the number of digits in an integer entered by the user.
 * It uses a while loop to remove the last digit in each iteration and count how many times this occurs.
 */
public class Q6 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        try {
            // Get integer input from the user.
            System.out.print("Enter an integer to count its digits: ");
            int number = scanner.nextInt();

            // Handle the special case where the input is 0.
            if (number == 0) {
                System.out.println("The number of digits is: 1");
                return;
            }

            // For negative numbers, we work with the absolute value.
            number = Math.abs(number);

            int count = 0;

            // Use a while loop to remove one digit at a time.
            while (number != 0) {
                // Remove the last digit using integer division.
                number /= 10;
                
                // Increment the counter for each digit removed.
                count++;
            }

            // Print the final result.
            System.out.println("The number of digits is: " + count);

        } catch (InputMismatchException e) {
            // Handle the case where the user enters non-integer input.
            System.out.println("Error: Invalid input. Please enter a whole number.");
        } finally {
            // Close the scanner to prevent resource leaks.
            scanner.close();
        }
    }
}
