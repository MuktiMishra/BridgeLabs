import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double number;

        try {
            // Use a do-while loop to ensure the code block runs at least once.
            do {
                System.out.print("Enter a number (0 to stop): ");
                number = scanner.nextDouble();
                total += number;
            } while (number != 0);

            // After the loop, display the final total.
            System.out.println("The total sum is: " + total);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }
}
