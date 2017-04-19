
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Declare variables
        int power, sum;
        
        // Get power from input
        System.out.print("Type a number: ");
        power = Integer.parseInt(reader.nextLine());
        
        // Calculate sum of powers
        sum = (int)Math.pow(2, power);
        
        // Display result
        System.out.println("The result is " + sum);
    }
}
