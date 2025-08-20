import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A simple command-line calculator program that takes two numbers and an
 * operator from the user and performs the corresponding arithmetic operation.
 * It uses a switch-case statement to handle different operators.
 */
public class Q10 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);
        double result = 0.0;
        boolean validOperation = true;

        try {
            // Get the first number from the user.
            System.out.print("Enter the first number: ");
            double firstNumber = scanner.nextDouble();

            // Get the operator from the user.
            System.out.print("Enter an operator (+, -, *, /): ");
            String operator = scanner.next();

            // Get the second number from the user.
            System.out.print("Enter the second number: ");
            double secondNumber = scanner.nextDouble();

            // Use a switch statement to perform the calculation based on the operator.
            switch (operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    // Handle division by zero to prevent an error.
                    if (secondNumber != 0) {
                        result = firstNumber / secondNumber;
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                        validOperation = false;
                    }
                    break;
                default:
                    // This case handles any invalid operator input.
                    System.out.println("Error: Invalid Operator.");
                    validOperation = false;
                    break;
            }

            // Print the result only if the operation was valid.
            if (validOperation) {
                System.out.printf("Result: %.2f\n", result);
            }

        } catch (InputMismatchException e) {
            // Handle the case where the user enters non-numeric input.
            System.out.println("Error: Invalid input. Please enter valid numbers.");
        } finally {
            // Close the scanner to prevent resource leaks.
            scanner.close();
        }
    }
}
