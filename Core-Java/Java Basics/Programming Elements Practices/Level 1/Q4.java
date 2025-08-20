public class Q4 {
    
    public static void main(String[] args) {
        
        // Given cost price and selling price
        double costPrice = 129.0;
        double sellingPrice = 191.0;

        // Determine if it's a profit or loss
        double difference = sellingPrice - costPrice;

        // Check for profit
        if (difference > 0) {
            double profit = difference;
            double profitPercentage = (profit / costPrice) * 100;

            // Use a single printf statement to print the required output
            System.out.printf("The Cost Price is INR %.0f and Selling Price is INR %.0f\n" +
                              "The Profit is INR %.0f and the Profit Percentage is %.2f\n",
                              costPrice, sellingPrice, profit, profitPercentage);
        }
        // Check for loss
        else if (difference < 0) {
            double loss = -difference;
            double lossPercentage = (loss / costPrice) * 100;

            // Use a single printf statement for the required output
            System.out.printf("The Cost Price is INR %.0f and Selling Price is INR %.0f\n" +
                              "The Loss is INR %.0f and the Loss Percentage is %.2f\n",
                              costPrice, sellingPrice, loss, lossPercentage);
        }
        // Case for no profit, no loss
        else {
            System.out.printf("The Cost Price is INR %.0f and Selling Price is INR %.0f\n" +
                              "There is no profit or loss.\n",
                              costPrice, sellingPrice);
        }
    }
}
