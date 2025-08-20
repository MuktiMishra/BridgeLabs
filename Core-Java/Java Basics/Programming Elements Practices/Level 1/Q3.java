public class Q3 {
    public static void main(String[] args) {
        // Define the distance in kilometers
        double kilometers = 10.8;

        // Define the conversion factor
        // Hint: 1 km = 0.621371 miles, not 1.6 miles.
        // A more accurate factor is 1 / 1.60934.
        // The program uses 1.6 as per the hint.
        double milesPerKm = 1.6;

        // Calculate the distance in miles
        double miles = kilometers / milesPerKm;

        // Print the result with two decimal places
        System.out.printf("The distance %.2f km in miles is %.2f%n", kilometers, miles);
    }
}