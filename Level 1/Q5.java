import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get the age input from the user.
            System.out.print("Please enter the person's age: ");
            int age = scanner.nextInt();

            // Check if the age is 18 or older.
            if (age >= 18) {
                System.out.println("The person's age is " + age + " and can vote.");
            } else {
                System.out.println("The person's age is " + age + " and cannot vote.");
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer for age.");
        } finally {
            scanner.close();
        }
    }
}
