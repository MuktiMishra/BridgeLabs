public class Q7 {

    public static void main(String[] args) {
        // Radius of the Earth in kilometers
        final double earthRadiusKm = 6378;
        
        // Constant for Pi
        final double pi = Math.PI;
        
        // Conversion factor from kilometers to miles (1 km = 0.621371 miles)
        final double kmToMiles = 0.621371;

        // Calculate the volume in cubic kilometers
        // Volume = (4/3) * pi * r^3
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(earthRadiusKm, 3);
        
        // Convert the radius to miles first
        double earthRadiusMiles = earthRadiusKm * kmToMiles;
        
        // Calculate the volume in cubic miles
        double volumeMiles3 = (4.0 / 3.0) * pi * Math.pow(earthRadiusMiles, 3);

        // Alternatively, convert the volume from km^3 to miles^3 directly
        // The conversion factor for volume is (kmToMiles)^3
        // double volumeMiles3 = volumeKm3 * Math.pow(kmToMiles, 3);

        // Print the final result in the specified format
        // Using printf for formatted output with two decimal places
        System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f\n", 
                          volumeKm3, volumeMiles3);
    }
}
