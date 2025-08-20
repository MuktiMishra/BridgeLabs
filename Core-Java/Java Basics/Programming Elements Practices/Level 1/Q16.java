import java.util.Scanner;

public class Q16 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Declare a variable for the number of students
        int numberOfStudents;

        // Prompt the user for the number of students
        System.out.print("Enter the number of students: ");
        
        // Get integer input for the numberOfStudents variable
        numberOfStudents = input.nextInt();

        // Use the formula to calculate the maximum number of handshakes:
        // C(n, 2) = n * (n - 1) / 2
        int numberOfHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the number of possible handshakes
        System.out.println("The maximum number of handshakes is: " + numberOfHandshakes);

        // Close the scanner to release resources
        input.close();
    }
}
