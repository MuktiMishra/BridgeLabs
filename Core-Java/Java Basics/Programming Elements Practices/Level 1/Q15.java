import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Declare variables for unit price and quantity
        double unitPrice;
        int quantity;

        // Prompt the user for the unit price and read the input
        System.out.print("Enter the unit price of the item: ");
        unitPrice = input.nextDouble();

        // Prompt the user for the quantity and read the input
        System.out.print("Enter the quantity to be purchased: ");
        quantity = input.nextInt();

        // Calculate the total purchase price
        double totalPrice = unitPrice * quantity;

        // Print the output in the required format
        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f\n", 
                          totalPrice, quantity, unitPrice);

        // Close the scanner to release resources
        input.close();
    }
}
