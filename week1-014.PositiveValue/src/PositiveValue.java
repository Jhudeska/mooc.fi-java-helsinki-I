
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Declare variables
        int userNum;
        
        // Get number from user
        System.out.print("Type a number: ");
        userNum = Integer.parseInt(reader.nextLine());

        // Check if positive/negative
        if (userNum > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }
}
