import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Declare a variable for the perimeter of the square
        double perimeter;

        // Prompt the user for the perimeter and read the input
        System.out.print("Enter the perimeter of the square: ");
        perimeter = input.nextDouble();

        // Calculate the side of the square
        // Hint: Perimeter = 4 * side, so Side = Perimeter / 4
        double side = perimeter / 4.0;

        // Print the final result in the required format
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f\n", side, perimeter);

        // Close the scanner to prevent resource leaks
        input.close();
    }
}
