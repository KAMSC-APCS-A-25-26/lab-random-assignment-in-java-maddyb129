import java.util.Random;

public class RandomPercentage {
    public static void main(String[] args) {
        // TODO: Create two Random objects
        // 1. One Random object without a seed (unseeded)
        // 2. One Random object with any seed value (seeded)
        Random rand1 = new Random();
        Random rand2 = new Random(1);
        // TODO: Generate random double values from both Random objects
        // Use nextDouble() method to get values between 0.0 and 1.0
        double percent1 = rand1.nextDouble();
        double percent2 = rand2.nextDouble();
        // TODO: Format as percentages
        // Format the values to exactly 2 decimal places
        // Display with % symbol
        System.out.printf("Unseeded Random: %.2f", rand1.nextDouble());
        System.out.println("%");
        System.out.printf("Seeded Random: %.2f", rand2.nextDouble());
        System.out.println("%");
        // TODO: Display the values as percentages
        // Show both unseeded and seeded random values
        // Each value should be formatted as below
    }
}