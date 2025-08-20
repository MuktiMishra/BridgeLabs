public class Q5 {

    public static void main(String[] args) {
        // Total number of pens
        int totalPens = 14;

        // Number of students
        int numberOfStudents = 3;

        // Use the division operator to find pens per student
        int pensPerStudent = totalPens / numberOfStudents;

        // Use the modulus operator to find the remaining pens
        int remainingPens = totalPens % numberOfStudents;

        // Print the result in the required format
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
