import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Declare variables for the three numbers
        int a;
        int b;
        int c;

        // Take user input for a, b, and c
        System.out.print("Enter the value for a: ");
        a = input.nextInt();

        System.out.print("Enter the value for b: ");
        b = input.nextInt();

        System.out.print("Enter the value for c: ");
        c = input.nextInt();

        // Perform the integer operations and understand the precedence of the operators
        // 1. Multiplication has higher precedence than addition
        int result1 = a + b * c;
        
        // 2. Multiplication has higher precedence than addition
        int result2 = a * b + c;

        // 3. Division has higher precedence than addition
        int result3 = c + a / b;
        
        // 4. Modulo has higher precedence than addition
        int result4 = a % b + c;

        // Print the results of the operations
        System.out.printf("The results of Int Operations are %d, %d, %d, and %d\n", 
                          result1, result2, result3, result4);
                          
        // Close the scanner to release resources
        input.close();
    }
}
