import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A program to check if a given integer is a Harshad number.
 * A Harshad number is divisible by the sum of its digits.
 */
public class Q8 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        try {
            // Get integer input from the user.
            System.out.print("Enter a positive integer to check if it's a Harshad number: ");
            int number = scanner.nextInt();
            
            // Check for valid input.
            if (number <= 0) {
                System.out.println("Error: Please enter a positive integer.");
                return;
            }

            int originalNumber = number;
            int sumOfDigits = 0;
            
            // Use a while loop to find the sum of the digits.
            while (originalNumber > 0) {
                int digit = originalNumber % 10;
                sumOfDigits += digit;
                originalNumber /= 10;
            }

            // Check if the number is perfectly divisible by the sum of its digits.
            if (number % sumOfDigits == 0) {
                System.out.println(number + " is a Harshad Number.");
            } else {
                System.out.println(number + " is not a Harshad Number.");
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
