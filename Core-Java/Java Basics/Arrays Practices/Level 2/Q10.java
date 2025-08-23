import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take the input for a number
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Create a frequency array of size 10 to store the count of each digit (0-9)
        int[] frequency = new int[10];

        // Handle the case of the number being 0 separately
        if (number == 0) {
            frequency[0] = 1;
        } else {
            // Use a temporary variable to work with the number without modifying the original
            long tempNumber = number;

            // Loop through the digits of the number
            while (tempNumber > 0) {
                // Find the last digit using the modulo operator
                int digit = (int) (tempNumber % 10);
                
                // Increase the frequency of that digit
                frequency[digit]++;

                // Remove the last digit from the number
                tempNumber /= 10;
            }
        }

        System.out.println("\n--- Digit Frequency ---");

        // Display the frequency of each digit
        for (int i = 0; i < 10; i++) {
            // Only display digits that appeared at least once
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }

        scanner.close();
    }
}