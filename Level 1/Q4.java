import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get integer input from the user.
            System.out.print("Please enter a number: ");
            int number = scanner.nextInt();

            // A natural number is a positive integer.
            if (number > 0) {
                // Calculate the sum using the formula n * (n+1) / 2.
                long sumOfNumbers = (long) number * (number + 1) / 2;
                System.out.println("The sum of " + number + " natural numbers is " + sumOfNumbers);
            } else {
                // The number is not a natural number if it's zero or negative.
                System.out.println("The number " + number + " is not a natural number");
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
