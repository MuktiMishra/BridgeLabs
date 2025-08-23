import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Create a 2D array to store marks: rows for students, columns for subjects
        // Column 0: Physics, Column 1: Chemistry, Column 2: Math
        int[][] studentMarks = new int[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        // Take input for marks in physics, chemistry, and maths
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");

            System.out.print("Physics: ");
            int physics = scanner.nextInt();
            while (physics < 0) {
                System.out.println("Marks cannot be negative. Please enter a positive value.");
                System.out.print("Physics: ");
                physics = scanner.nextInt();
            }
            studentMarks[i][0] = physics;

            System.out.print("Chemistry: ");
            int chemistry = scanner.nextInt();
            while (chemistry < 0) {
                System.out.println("Marks cannot be negative. Please enter a positive value.");
                System.out.print("Chemistry: ");
                chemistry = scanner.nextInt();
            }
            studentMarks[i][1] = chemistry;

            System.out.print("Math: ");
            int math = scanner.nextInt();
            while (math < 0) {
                System.out.println("Marks cannot be negative. Please enter a positive value.");
                System.out.print("Math: ");
                math = scanner.nextInt();
            }
            studentMarks[i][2] = math;

            // Calculate the percentage using the 2D array
            int totalMarks = studentMarks[i][0] + studentMarks[i][1] + studentMarks[i][2];
            percentages[i] = (double) totalMarks / 3.0;

            // Calculate the grade based on the percentage
            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }
        
        System.out.println("\n--- Student Results ---");
        // Display the marks, percentages, and grades
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Physics Marks: " + studentMarks[i][0]);
            System.out.println("Chemistry Marks: " + studentMarks[i][1]);
            System.out.println("Math Marks: " + studentMarks[i][2]);
            System.out.printf("Percentage: %.2f%%\n", percentages[i]);
            System.out.println("Grade: " + grades[i]);
        }

        scanner.close();
    }
}