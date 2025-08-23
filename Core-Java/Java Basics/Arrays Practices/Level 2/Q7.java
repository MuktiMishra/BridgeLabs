import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // 2D array -> [person][0=height, 1=weight, 2=BMI]
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Input height and weight for each person
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");

            // Height input with validation
            double height;
            do {
                System.out.print("Enter height in meters: ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be positive. Try again.");
                }
            } while (height <= 0);

            // Weight input with validation
            double weight;
            do {
                System.out.print("Enter weight in kilograms: ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be positive. Try again.");
                }
            } while (weight <= 0);

            // Calculate BMI
            double bmi = weight / (height * height);

            // Store data
            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = bmi;

            // Determine weight status
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\n--- Person Details ---");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d -> Height: %.2f m, Weight: %.2f kg, BMI: %.2f, Status: %s%n",
                    (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}
