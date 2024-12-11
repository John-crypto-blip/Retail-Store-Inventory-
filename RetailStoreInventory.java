// John Renzel M. Fangon
// CC2 1B
// Challenge No. 1 

 import java.util.Scanner;

public class RetailStoreInventory {

    public static void main(String[] args) {
        // Initialize arrays to store quantities and prices for 10 products
        int[] quantities = new int[10];
        double[] prices = new double[10];
        
        // Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Gather user input for quantities and prices
        try {
            // Loop to collect quantities and prices for 10 products
            for (int i = 0; i < 10; i++) {
                System.out.print("Enter quantity for product " + (i + 1) + ": ");
                quantities[i] = scanner.nextInt();  // Read quantity
                
                System.out.print("Enter price for product " + (i + 1) + ": ");
                prices[i] = scanner.nextDouble();   // Read price
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } finally {
            scanner.close();  // Close the scanner
        }

        // Output the quantities and prices
        System.out.println("\nInventory Summary:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Product " + (i + 1) + " - Quantity: " + quantities[i] + ", Price: $" + prices[i]);
        }
    }
}