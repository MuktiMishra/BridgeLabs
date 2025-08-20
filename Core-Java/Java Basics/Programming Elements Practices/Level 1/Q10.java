import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their height in centimeters
        System.out.print("Enter your height in centimeters: ");

        // Read the user's input
        double heightCm = input.nextDouble();

        // Conversion factors
        // 1 inch = 2.54 cm
        // 1 foot = 12 inches
        final double CM_PER_INCH = 2.54;
        final int INCHES_PER_FOOT = 12;

        // Convert centimeters to total inches
        double totalInches = heightCm / CM_PER_INCH;

        // Calculate the number of full feet
        int feet = (int) (totalInches / INCHES_PER_FOOT);

        // Calculate the remaining inches
        double inches = totalInches % INCHES_PER_FOOT;

        // Print the output in the required format
        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f\n", 
                          heightCm, feet, inches);

        // Close the scanner
        input.close();
    }
}
