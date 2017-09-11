
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Declare variables
        int limit, i;
        
        // Get upper limit from input
        System.out.print("Up to what number? ");
        limit = Integer.parseInt(reader.nextLine());
        
        i = 1;
        
        // Print whole numbers from 1 up to given number
        while (i <= limit) {
            System.out.println(i);
            i++;
        }
    }
}
