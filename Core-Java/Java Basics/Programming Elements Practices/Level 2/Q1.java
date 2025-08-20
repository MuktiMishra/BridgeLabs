import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Declare variables for the two numbers
        double number1;
        double number2;

        // Prompt the user for the first number and read the input
        System.out.print("Enter the first number: ");
        number1 = input.nextDouble();

        // Prompt the user for the second number and read the input
        System.out.print("Enter the second number: ");
        number2 = input.nextDouble();

        // Perform the arithmetic operations and store the results
        double sum = number1 + number2;
        double difference = number1 - number2;
        double product = number1 * number2;
        double quotient = 0.0;

        // Check for division by zero
        if (number2 != 0) {
            quotient = number1 / number2;
        } else {
            System.out.println("Cannot divide by zero. The division result will be 0.");
        }

        // Print the output using a single formatted statement
        System.out.printf("The addition, subtraction, multiplication, and division value of %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f\n", 
                          number1, number2, sum, difference, product, quotient);
                          
        // Close the scanner to prevent resource leaks
        input.close();
    }
}
