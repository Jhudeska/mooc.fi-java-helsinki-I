
import java.util.Scanner;

public class ManyPrints {
    // NOTE: do not change the method definition, e.g. add parameters to method
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    public static void main(String[] args) {
        // ask the user how many times the text should be printed
        // use the while structure to call the printText method several times
        Scanner reader = new Scanner(System.in);
        
        // Declare variables
        int count, i;
        
        // Get input
        System.out.println("How many?");
        count = Integer.parseInt(reader.nextLine());
        
        // Call printText() 'count' number of times
        i = 0;
        while (i < count) {
            printText();
            i++;
        }
    }
}