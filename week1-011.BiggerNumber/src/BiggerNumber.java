
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Declare variables
        int a, b;
        
        // Get numbers from user
        System.out.print("Type a number: ");
        a = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        b = Integer.parseInt(reader.nextLine());
        
        // Display result
        System.out.println("The bigger number of the two numbers given was: " + Math.max(a, b));
    }
}
