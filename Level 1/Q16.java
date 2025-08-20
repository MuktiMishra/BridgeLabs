import java.util.Scanner;

/**
 * This program takes a positive integer from the user and
 * prints all odd and even numbers from 1 up to that number.
 */
public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Validate if the input is a natural number.
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
        } else {
            System.out.println("Numbers from 1 to " + number + ":");
            // Iterate from 1 up to the number entered by the user.
            for (int i = 1; i <= number; i++) {
                // Check if the number is even or odd using the modulo operator (%).
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        }

        scanner.close();
    }
}
