import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A program to find the youngest and tallest among three friends: Amar, Akbar, and Anthony.
 * It takes their ages and heights as input and determines who is the youngest and who is the tallest.
 */
public class Q6 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);
        
        try {
            // --- Get Ages ---
            System.out.println("Enter the ages of Amar, Akbar, and Anthony:");
            System.out.print("Amar's age: ");
            int amarAge = scanner.nextInt();
            System.out.print("Akbar's age: ");
            int akbarAge = scanner.nextInt();
            System.out.print("Anthony's age: ");
            int anthonyAge = scanner.nextInt();

            // --- Get Heights ---
            System.out.println("\nEnter the heights of Amar, Akbar, and Anthony (in cm):");
            System.out.print("Amar's height: ");
            double amarHeight = scanner.nextDouble();
            System.out.print("Akbar's height: ");
            double akbarHeight = scanner.nextDouble();
            System.out.print("Anthony's height: ");
            double anthonyHeight = scanner.nextDouble();

            // --- Find the Youngest Friend ---
            // Assume Amar is the youngest initially.
            String youngestFriend = "Amar";
            
            // Check if Akbar is younger.
            if (akbarAge < amarAge) {
                youngestFriend = "Akbar";
            }
            // Now, check if Anthony is younger than the current youngest.
            if (anthonyAge < Math.min(amarAge, akbarAge)) {
                youngestFriend = "Anthony";
            }
            
            // This is a more direct way using Math.min for clarity:
            /*
            String youngestFriend;
            if (amarAge <= akbarAge && amarAge <= anthonyAge) {
                youngestFriend = "Amar";
            } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
                youngestFriend = "Akbar";
            } else {
                youngestFriend = "Anthony";
            }
            */

            // --- Find the Tallest Friend ---
            // Assume Amar is the tallest initially.
            String tallestFriend = "Amar";

            // Check if Akbar is taller.
            if (akbarHeight > amarHeight) {
                tallestFriend = "Akbar";
            }
            // Now, check if Anthony is taller than the current tallest.
            if (anthonyHeight > Math.max(amarHeight, akbarHeight)) {
                tallestFriend = "Anthony";
            }

            // This is a more direct way using Math.max for clarity:
            /*
            String tallestFriend;
            if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
                tallestFriend = "Amar";
            } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
                tallestFriend = "Akbar";
            } else {
                tallestFriend = "Anthony";
            }
            */

            // --- Print the Results ---
            System.out.println("\n--- Results ---");
            System.out.println("The youngest friend is: " + youngestFriend);
            System.out.println("The tallest friend is: " + tallestFriend);

        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter numbers for age and height.");
        } finally {
            // Close the scanner to prevent resource leaks.
            scanner.close();
        }
    }
}
