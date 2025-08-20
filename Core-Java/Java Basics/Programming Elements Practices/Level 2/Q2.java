import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Declare variables for the base and height in centimeters
        double baseCm;
        double heightCm;

        // Prompt the user for the base of the triangle
        System.out.print("Enter the base of the triangle in cm: ");
        baseCm = input.nextDouble();

        // Prompt the user for the height of the triangle
        System.out.print("Enter the height of the triangle in cm: ");
        heightCm = input.nextDouble();

        // Calculate the area in square centimeters
        // Area = 1/2 * base * height
        double areaCm2 = 0.5 * baseCm * heightCm;

        // Conversion factor from cm to inches: 1 inch = 2.54 cm
        // To convert cm^2 to inches^2, we divide by (2.54)^2
        final double CM_PER_INCH = 2.54;
        double areaIn2 = areaCm2 / (CM_PER_INCH * CM_PER_INCH);

        // Print the final result
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f\n",
                          areaIn2, areaCm2);

        // Close the scanner
        input.close();
    }
}
