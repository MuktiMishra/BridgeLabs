import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Declare variables for the base and height of the triangle
        double base;
        double height;

        // Prompt the user for the base of the triangle and read the input
        System.out.print("Enter the base of the triangle in centimeters: ");
        base = input.nextDouble();

        // Prompt the user for the height of the triangle and read the input
        System.out.print("Enter the height of the triangle in centimeters: ");
        height = input.nextDouble();

        // Calculate the area in square centimeters
        double areaCm2 = 0.5 * base * height;

        // Convert the area to square inches
        // 1 inch = 2.54 cm, so 1 inch^2 = (2.54 cm)^2
        final double CM_PER_INCH = 2.54;
        double areaIn2 = areaCm2 / (CM_PER_INCH * CM_PER_INCH);

        // Print the final result
        System.out.printf("The area of the triangle in square centimeters is %.2f and in square inches is %.2f\n", 
                          areaCm2, areaIn2);

        // Close the scanner to prevent resource leaks
        input.close();
    }
}
