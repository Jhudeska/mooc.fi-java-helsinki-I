
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Declare variables
        int limit, sum, i;
        
        // Initialize variables
        sum = 0;
        i = 1;
        
        // Get limit from input
        System.out.print("Until what? ");
        limit = Integer.parseInt(reader.nextLine());
        
        // Find sum
        while (i <= limit) {
            sum += i;
            i++;
        }
    }
}
