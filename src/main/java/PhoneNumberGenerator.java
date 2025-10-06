import java.util.Random;

public class PhoneNumberGenerator {
    public static void main(String[] args) {
        // TODO: Create Random object for phone number generation
        Random rand = new Random();
        // TODO: Generate first three digits (XXX)
        // Constraint: Cannot contain 8 or 9 (digits 0-7 only)
        int num1 = rand.nextInt(7);
        int num2 = rand.nextInt(7);
        int num3 = rand.nextInt(7);
        // TODO: Generate second three digits (XXX) 
        // Constraint: Must be <= 742 (000-742)
        int num4 = rand.nextInt(7);
        int num5 = rand.nextInt(7) ;
        int num6 = rand.nextInt(7);
        // TODO: Generate third three digits (XXX)
        // No constraints (000-999)
        int num7 = rand.nextInt(9);
        int num8 = rand.nextInt(9);
        int num9 = rand.nextInt(9);
        // TODO: Format and display phone number as XXX-XXX-XXX
        // Include the dashes in the output
        System.out.print(num1);
        System.out.print(num2);
        System.out.print(num3);
        System.out.print("-");
        System.out.print(num4);
        System.out.print(num5);
        System.out.print(num6);
        System.out.print("-");
        System.out.print(num7);
        System.out.print(num8);
        System.out.print(num9);
    }
}
