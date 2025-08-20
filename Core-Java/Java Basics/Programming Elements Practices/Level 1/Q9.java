import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get the starting value for the countdown.
            System.out.print("Please enter the starting number for the countdown: ");
            int number = scanner.nextInt();

            // Use a for loop to iterate from 'number' down to 1.
            for (int i = number; i >= 1; i--) {
                System.out.println(i);
            }
            
            System.out.println("Rocket launch!");

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
