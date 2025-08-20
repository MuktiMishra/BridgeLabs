import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A program to check if a given integer is a prime number.
 * It takes a number as input and uses a loop to determine if it has
 * any factors other than 1 and itself.
 */
public class Q4 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Get integer input from the user.
            System.out.print("Enter a positive integer to check if it's a prime number: ");
            int number = scanner.nextInt();

            // Prime numbers are greater than 1.
            if (number <= 1) {
                System.out.println(number + " is not a prime number.");
                return;
            }

            boolean isPrime = true;

            // Loop from 2 up to the number itself.
            // We only need to check up to the square root of the number for efficiency,
            // but the hint asks to loop to the number, so we will follow that logic.
            for (int i = 2; i < number; i++) {
                // Check if the number is perfectly divisible by i.
                if (number % i == 0) {
                    isPrime = false; // It is not a prime number.
                    break;          // Exit the loop immediately.
                }
            }
            
            // Print the final result based on the isPrime variable.
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
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
