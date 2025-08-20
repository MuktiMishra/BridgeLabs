import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A program to calculate the percentage and grade for three subjects (Physics, Chemistry, Maths).
 * The grading scale is based on the guidelines provided.
 */
public class Q3 {

    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Get marks for each subject.
            System.out.print("Enter marks for Physics (out of 100): ");
            double physicsMarks = scanner.nextDouble();

            System.out.print("Enter marks for Chemistry (out of 100): ");
            double chemistryMarks = scanner.nextDouble();
            
            System.out.print("Enter marks for Maths (out of 100): ");
            double mathsMarks = scanner.nextDouble();

            // Validate that the marks are within a reasonable range (0-100).
            if (physicsMarks < 0 || physicsMarks > 100 || 
                chemistryMarks < 0 || chemistryMarks > 100 || 
                mathsMarks < 0 || mathsMarks > 100) {
                System.out.println("Error: Marks must be between 0 and 100.");
                return;
            }

            // Calculate the total marks and average percentage.
            double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
            double percentage = (totalMarks / 300) * 100;
            
            // Determine the grade and remarks based on the percentage.
            String grade;
            String remarks;

            if (percentage >= 80) {
                grade = "A";
                remarks = "Level 4, above agency-normalized standards";
            } else if (percentage >= 70) {
                grade = "B";
                remarks = "Level 3, at agency-normalized standards";
            } else if (percentage >= 60) {
                grade = "C";
                remarks = "Level 2, below, but approaching agency-normalized standards";
            } else if (percentage >= 50) {
                grade = "D";
                remarks = "Level 1, well below agency-normalized standards";
            } else if (percentage >= 40) {
                grade = "E";
                remarks = "Level 1-, too below agency-normalized standards";
            } else {
                grade = "R";
                remarks = "Remedial standards";
            }

            // Print the results.
            System.out.println("\n--- Results ---");
            System.out.printf("Average Mark: %.2f%%\n", percentage);
            System.out.println("Grade: " + grade);
            System.out.println("Remarks: " + remarks);

        } catch (InputMismatchException e) {
            // Handle the case where the user enters non-numeric input.
            System.out.println("Error: Invalid input. Please enter valid numbers for the marks.");
        } finally {
            // Close the scanner.
            scanner.close();
        }
    }
}