
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Declare variables
        int lowerLimit, upperLimit, sum, i;
        
        // Get limit from input
        System.out.print("First: ");
        lowerLimit = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        upperLimit = Integer.parseInt(reader.nextLine());
        
        // Initialize variables
        sum = 0;
        i = lowerLimit;

        // Find sum
        while (i <= upperLimit) {
            sum += i;
            i++;
        }
        
        // Display sum
        System.out.println("Sum is " + sum);
    }
}
