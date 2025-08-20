import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Create a variable named fee and take user input for the fee
        double fee;
        System.out.print("Enter the course fee in INR: ");
        fee = input.nextDouble();

        // Create another variable discountPercent and take user input for the discount
        double discountPercent;
        System.out.print("Enter the discount percentage: ");
        discountPercent = input.nextDouble();

        // Compute the discount amount
        double discount = (fee * discountPercent) / 100;

        // Compute the final fee to be paid by subtracting the discount from the fee
        double finalFee = fee - discount;

        // Print the output in the required format using a single statement
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f%n", discount, finalFee);

        // Close the scanner to release system resources
        input.close();
    }
}
