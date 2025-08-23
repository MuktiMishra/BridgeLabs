public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array length: " + numbers.length);

        //make an array and take i n    put for each element using loop
        int[] userInputArray = new int[5];
        for (int i = 0; i < userInputArray.length; i++) {
            userInputArray[i] = i + 1; // Simulating user input
        }

        System.out.println("User input array elements:");
        for (int number : userInputArray) {
            System.out.print(number + " ");
        }
        //size of the array
        System.out.println("\nSize of the array: " + userInputArray.length);
        
    }
}