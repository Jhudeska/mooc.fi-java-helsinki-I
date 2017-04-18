
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Declare variables
        int first, last, i;
        
        // Get limits from input
        System.out.print("First: ");
        first = Integer.parseInt(reader.nextLine());
        
        System.out.print("Last: ");
        last = Integer.parseInt(reader.nextLine());
        
        // Print numbers from 'first' to 'last'
        i = first;
        while (i <= last) {
            System.out.println(i);
            i++;
        }
    }
}
