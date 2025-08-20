import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Declare variables for the two numbers
        int number1;
        int number2;

        // Prompt the user for the first number and read the input
        System.out.print("Enter the first number (dividend): ");
        number1 = input.nextInt();

        // Prompt the user for the second number and read the input
        System.out.print("Enter the second number (divisor): ");
        number2 = input.nextInt();

        // Check for division by zero before performing operations
        if (number2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            // Calculate the quotient using the division operator (/)
            int quotient = number1 / number2;

            // Calculate the remainder using the modulo operator (%)
            int remainder = number1 % number2;

            // Print the output in the required format
            System.out.printf("The Quotient is %d and Reminder is %d of two number %d and %d\n",
                              quotient, remainder, number1, number2);
        }
        
        // Close the scanner to release resources
        input.close();
    }
}
