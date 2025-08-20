import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A program to calculate the Body Mass Index (BMI) of a person and
 * determine their weight status based on a given table.
 */
public class Q7 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Get weight in kilograms.
            System.out.print("Enter your weight in kilograms (kg): ");
            double weight = scanner.nextDouble();

            // Get height in centimeters.
            System.out.print("Enter your height in centimeters (cm): ");
            double heightCm = scanner.nextDouble();

            // Check for valid input values (non-negative).
            if (weight <= 0 || heightCm <= 0) {
                System.out.println("Error: Weight and height must be positive values.");
                return;
            }

            // Convert height from centimeters to meters.
            double heightMeters = heightCm / 100.0;

            // Calculate BMI using the formula: BMI = weight / (height * height).
            double bmi = weight / (heightMeters * heightMeters);

            // Determine the weight status based on the provided table.
            String status;
            if (bmi >= 40.0) {
                status = "Obese";
            } else if (bmi >= 25.0) {
                status = "Overweight";
            } else if (bmi >= 18.5) {
                status = "Normal";
            } else {
                status = "Underweight";
            }
            
            // Display the results.
            System.out.printf("\n--- Results ---\n");
            System.out.printf("Your BMI is: %.2f\n", bmi);
            System.out.println("Status: " + status);

        } catch (InputMismatchException e) {
            // Handle the case where the user enters non-numeric input.
            System.out.println("Error: Invalid input. Please enter numbers for weight and height.");
        } finally {
            // Close the scanner to prevent resource leaks.
            scanner.close();
        }
    }
}
