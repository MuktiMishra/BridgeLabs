import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A program to check if a given integer is an Armstrong number.
 * An Armstrong number is a number that is equal to the sum of the cubes of its digits.
 */
public class Q5 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        try {
            // Get integer input from the user.
            System.out.print("Enter a positive integer to check if it's an Armstrong number: ");
            int number = scanner.nextInt();

            // Check if the number is a positive integer.
            if (number <= 0) {
                System.out.println("Error: Please enter a positive integer.");
                return;
            }

            // Define variables as per the hint.
            int originalNumber = number;
            int sum = 0;
            int digit;

            // Use a while loop to process each digit of the number.
            while (originalNumber != 0) {
                // Find the last digit using the modulus operator.
                digit = originalNumber % 10;
                
                // Find the cube of the digit and add it to the sum.
                // Using Math.pow() can return a double, so we cast to int.
                sum += Math.pow(digit, 3);
                
                // Remove the last digit from the number using integer division.
                originalNumber /= 10;
            }

            // Check if the sum of cubes is equal to the original number.
            if (sum == number) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is not an Armstrong number.");
            }

        } catch (InputMismatchException e) {
            // Handle the case where the user enters non-integer input.
            System.out.println("Error: Invalid input. Please enter a whole number.");
        } finally {
            // Close the scanner to prevent resource leaks.
            scanner.close();
        }
    }
}
