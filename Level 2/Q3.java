import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A program to print a multiplication table for a number from 6 to 9.
 * It takes a number as input and uses a for loop to display the table.
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt for and read the number.
            System.out.print("Enter an integer to create a multiplication table for: ");
            int number = scanner.nextInt();

            // Use a for loop to iterate from 6 to 9.
            for (int i = 6; i <= 9; i++) {
                // Calculate the product.
                int product = number * i;
                // Print the result in the specified format.
                System.out.printf("%d * %d = %d\n", number, i, product);
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
