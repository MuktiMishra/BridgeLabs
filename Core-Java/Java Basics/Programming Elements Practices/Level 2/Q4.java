import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Declare a variable for the distance in feet
        double distanceInFeet;

        // Prompt the user for the distance in feet and read the input
        System.out.print("Enter the distance in feet: ");
        distanceInFeet = input.nextDouble();

        // Conversion factors based on the hint
        final int FEET_PER_YARD = 3;
        final int YARDS_PER_MILE = 1760;

        // Convert feet to yards
        double distanceInYards = distanceInFeet / FEET_PER_YARD;

        // Convert yards to miles
        double distanceInMiles = distanceInYards / YARDS_PER_MILE;

        // Print the final result in the required format
        System.out.printf("The distance in yards is %.2f while the distance in miles is %.2f\n", 
                          distanceInYards, distanceInMiles);

        // Close the scanner to prevent resource leaks
        input.close();
    }
}
