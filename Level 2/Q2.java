import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A program to calculate an employee's bonus based on years of service.
 * It takes salary and years of service as input and prints the bonus amount.
 */
public class EmployeeBonusCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Prompt for and read the employee's salary.
            System.out.print("Enter the employee's salary: ");
            double salary = scanner.nextDouble();
            
            // Prompt for and read the years of service.
            System.out.print("Enter the employee's years of service: ");
            int yearsOfService = scanner.nextInt();
            
            // Define the bonus percentage and the minimum years for the bonus.
            final double BONUS_PERCENTAGE = 0.05;
            final int MIN_YEARS_FOR_BONUS = 5;
            
            double bonusAmount = 0.0;
            
            // Check if the years of service are more than 5.
            if (yearsOfService > MIN_YEARS_FOR_BONUS) {
                // Calculate the bonus as 5% of the salary.
                bonusAmount = salary * BONUS_PERCENTAGE;
                System.out.printf("\nCongratulations! The employee is eligible for a bonus of: $%.2f\n", bonusAmount);
            } else {
                // The employee is not eligible.
                System.out.println("\nSorry, the employee is not eligible for a bonus at this time.");
            }
            
        } catch (InputMismatchException e) {
            // Catch the exception if the user enters non-numeric input.
            System.out.println("Error: Invalid input. Please enter a valid number for salary and years of service.");
        } finally {
            // Always close the scanner to prevent resource leaks.
            scanner.close();
        }
    }
}
