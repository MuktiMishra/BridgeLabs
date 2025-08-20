import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        // Create a variable to store the distance in kilometers
        double km;

        // Create a Scanner Object to take user input from Standard Input (the Keyboard)
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the distance in kilometers
        System.out.print("Enter the distance in kilometers: ");

        // Use the Scanner Object to read the user input for km
        km = input.nextDouble();

        // The hint states 1 mile = 1.6 km, so we use this for the conversion.
        // The actual conversion is closer to 1 mile = 1.60934 kilometers.
        final double CONVERSION_FACTOR = 1.6;

        // Calculate the distance in miles
        double miles = km / CONVERSION_FACTOR;

        // Print the output in the required format
        System.out.printf("The total miles is %.2f mile for the given %.2f km\n", miles, km);

        // Close the scanner to prevent resource leaks
        input.close();
    }
}
