public class Q2 {

    public static void main(String[] args) {
        // Define the marks for each subject
        int mathsMark = 94;
        int physicsMark = 95;
        int chemistryMark = 96;

        // Calculate the total sum of the marks
        int totalMarks = mathsMark + physicsMark + chemistryMark;

        // Calculate the average mark
        // Use double to ensure floating-point division
        double averageMark = (double) totalMarks / 3;

        // Print the result
        System.out.printf("Sam’s average mark in PCM is %.2f\n", averageMark);
    }
}