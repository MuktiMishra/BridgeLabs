import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Declare variables for the three numbers as double data type
        double a;
        double b;
        double c;

        // Take user input for a, b, and c
        System.out.print("Enter the value for a (double): ");
        a = input.nextDouble();

        System.out.print("Enter the value for b (double): ");
        b = input.nextDouble();

        System.out.print("Enter the value for c (double): ");
        c = input.nextDouble();

        // Perform the operations. Operator precedence remains the same:
        // Multiplication, division, and modulo are performed before addition and subtraction.
        
        // Operation 1: a + b * c
        double result1 = a + b * c;
        
        // Operation 2: a * b + c
        double result2 = a * b + c;

        // Operation 3: c + a / b
        double result3 = c + a / b;
        
        // Operation 4: a % b + c
        double result4 = a % b + c;

        // Print the results of all four operations
        // Using %.2f for two decimal places in the output
        System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f\n", 
                          result1, result2, result3, result4);
                          
        // Close the scanner to release resources
        input.close();
    }
}
