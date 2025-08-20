import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A program to check if a number is an Abundant number.
 * An Abundant number is one where the sum of its proper divisors is
 * greater than the number itself.
 */
public class Q9 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Get integer input from the user.
            System.out.print("Enter a positive integer to check if it's an Abundant number: ");
            int number = scanner.nextInt();

            // Check for valid input.
            if (number <= 0) {
                System.out.println("Error: Please enter a positive integer.");
                return;
            }

            int sum = 0;

            // Loop from 1 up to the number - 1 to find its proper divisors.
            for (int i = 1; i < number; i++) {
                // Check if 'i' is a divisor of 'number'.
                if (number % i == 0) {
                    sum += i; // Add the divisor to the sum.
                }
            }

            // Check if the sum of the divisors is greater than the number itself.
            if (sum > number) {
                System.out.println(number + " is an Abundant Number.");
            } else {
                System.out.println(number + " is not an Abundant Number.");
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
