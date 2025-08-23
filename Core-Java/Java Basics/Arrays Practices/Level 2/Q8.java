import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // b. Create arrays to store marks, percentages, and grades
        int[] physicsMarks = new int[numberOfStudents];
        int[] chemistryMarks = new int[numberOfStudents];
        int[] mathMarks = new int[numberOfStudents];
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        // c. Take input for marks in physics, chemistry, and maths with negative value check
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");

            System.out.print("Physics: ");
            int physics = scanner.nextInt();
            while (physics < 0) {
                System.out.println("Marks cannot be negative. Please enter a positive value.");
                System.out.print("Physics: ");
                physics = scanner.nextInt();
            }
            physicsMarks[i] = physics;

            System.out.print("Chemistry: ");
            int chemistry = scanner.nextInt();
            while (chemistry < 0) {
                System.out.println("Marks cannot be negative. Please enter a positive value.");
                System.out.print("Chemistry: ");
                chemistry = scanner.nextInt();
            }
            chemistryMarks[i] = chemistry;

            System.out.print("Math: ");
            int math = scanner.nextInt();
            while (math < 0) {
                System.out.println("Marks cannot be negative. Please enter a positive value.");
                System.out.print("Math: ");
                math = scanner.nextInt();
            }
            mathMarks[i] = math;

            // d. Calculate the percentage
            int totalMarks = physics + chemistry + math;
            percentages[i] = (double) totalMarks / 3.0;

            // e. Calculate the grade based on the percentage
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
        // f. Display the marks, percentages, and grades
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Physics Marks: " + physicsMarks[i]);
            System.out.println("Chemistry Marks: " + chemistryMarks[i]);
            System.out.println("Math Marks: " + mathMarks[i]);
            System.out.printf("Percentage: %.2f%%\n", percentages[i]);
            System.out.println("Grade: " + grades[i]);
        }

        scanner.close();
    }
}