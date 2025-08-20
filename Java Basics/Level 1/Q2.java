import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get three integer inputs from the user.
            System.out.print("Please enter the first number: ");
            int number1 = scanner.nextInt();
            System.out.print("Please enter the second number: ");
            int number2 = scanner.nextInt();
            System.out.print("Please enter the third number: ");
            int number3 = scanner.nextInt();

            // Check if the first number is less than or equal to both the second and third numbers.
            String result = (number1 <= number2 && number1 <= number3) ? "Yes" : "No";

            // Print the output in the specified format.
            System.out.println("Is the first number the smallest? " + result);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }
}
