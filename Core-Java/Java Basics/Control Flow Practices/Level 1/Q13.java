import java.util.Scanner;

/**
 * This program calculates the sum of the first 'n' natural numbers
 * using both a for loop and the mathematical formula.
 * It then compares the results to confirm they are the same.
 */
public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number (a positive integer): ");
        int n = scanner.nextInt();

        // Validate if the input is a natural number (positive integer).
        if (n <= 0) {
            System.out.println("Error: Please enter a positive integer.");
        } else {
            // --- Calculation using the for loop ---
            long sumForLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumForLoop += i;
            }

            // --- Calculation using the mathematical formula ---
            // Use 'long' for the result to avoid potential integer overflow for large 'n'.
            long sumFormula = (long) n * (n + 1) / 2;

            // Display the results and compare them.
            System.out.println("Sum using for loop: " + sumForLoop);
            System.out.println("Sum using formula n*(n+1)/2: " + sumFormula);

            if (sumForLoop == sumFormula) {
                System.out.println("The results from both computations are correct.");
            } else {
                System.out.println("The results do not match.");
            }
        }

        scanner.close();
    }
}
