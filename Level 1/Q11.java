import java.util.Scanner;

/**
 * This program continuously takes numbers as input and adds them to a running sum.
 * The loop terminates when the user enters 0 or a negative number.
 */
public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;

        // Use an infinite while loop that will be broken explicitly.
        System.out.println("Enter numbers (enter 0 or a negative number to stop and get the sum):");
        while (true) {
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();

            // Check the condition to break the loop.
            if (number <= 0) {
                break; // Exit the while loop if the number is zero or negative.
            }

            // Add the number to the total sum.
            total += number;
        }

        // Print the final result after the loop ends.
        System.out.println("The total sum is: " + total);

        scanner.close();
    }
}
