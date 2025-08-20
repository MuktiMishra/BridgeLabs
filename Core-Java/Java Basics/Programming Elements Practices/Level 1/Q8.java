import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get the starting value for the countdown.
            System.out.print("Please enter the starting number for the countdown: ");
            int counter = scanner.nextInt();

            // Use a while loop to continue as long as the counter is greater than or equal to 1.
            while (counter >= 1) {
                // Print the current value of the counter.
                System.out.println(counter);
                // Decrement the counter for the next iteration.
                counter--;
            }

            System.out.println("Rocket launch!");

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
