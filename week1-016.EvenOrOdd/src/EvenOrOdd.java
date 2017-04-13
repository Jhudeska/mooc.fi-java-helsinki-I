
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Declare variables
        int userNum;
        
        // Get number from user
        System.out.print("Type a number: ");
        userNum = Integer.parseInt(reader.nextLine());
        
        // Check if even or odd
        if (userNum % 2 == 0) {
            System.out.println("Number " + userNum + " is even.");
        } else {
            System.out.println("Number " + userNum + " is odd.");
        }

        // NOTE:
        // Parity of a value can be easily checked with modulo-operator %.
        // Test the following:
        // System.out.println( 1%2 );
        // System.out.println( 2%2 );
        // System.out.println( 3%2 );
        // System.out.println( 4%2 );
        // System.out.println( 5%2 );
        // System.out.println( 6%2 );
        // System.out.println( 7%2 );
        // int value = 8
        // System.out.println( value%2 );

    }
}
