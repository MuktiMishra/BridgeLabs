import java.util.Scanner;

public class Q3 {
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

            // Check and print if the first number is the largest.
            System.out.println("Is the first number the largest? " + ((number1 >= number2 && number1 >= number3) ? "Yes" : "No"));

            // Check and print if the second number is the largest.
            System.out.println("Is the second number the largest? " + ((number2 >= number1 && number2 >= number3) ? "Yes" : "No"));

            // Check and print if the third number is the largest.
            System.out.println("Is the third number the largest? " + ((number3 >= number1 && number3 >= number2) ? "Yes" : "No"));

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }
}
