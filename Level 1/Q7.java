import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get the month and day as integers from the user.
            System.out.print("Please enter the month (1-12): ");
            int month = scanner.nextInt();
            System.out.print("Please enter the day (1-31): ");
            int day = scanner.nextInt();

            // The condition for Spring Season is from March 20 to June 20.
            boolean isSpring = (month >= 3 && month <= 6);
            
            // Refine the condition for the edge months
            if (isSpring) {
                if (month == 3 && day < 20) {
                    isSpring = false;
                }
                if (month == 6 && day > 20) {
                    isSpring = false;
                }
            }

            if (isSpring) {
                System.out.println("It's a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid integers for month and day.");
        } finally {
            scanner.close();
        }
    }
}
