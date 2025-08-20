import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get integer input from the user.
            System.out.print("Please enter a number: ");
            int number = scanner.nextInt();

            // Check if the number is divisible by 5 using the modulo operator.
            // The result of `number % 5` is 0 if the number is perfectly divisible.
            String result = (number % 5 == 0) ? "Yes" : "No";

            // Print the output in the specified format.
            System.out.println("Is the number " + number + " divisible by 5? " + result);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
