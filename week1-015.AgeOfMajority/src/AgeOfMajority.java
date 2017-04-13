
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Declare variables
        int age;
        
        // Get age from user
        System.out.print("How old are you? ");
        age = Integer.parseInt(reader.nextLine());
        
        // Check if majority
        if (age >= 18) {
            System.out.println("You have reached the age of majority!");
        } else {
            System.out.println("You have not reached the age of majority yet!");
        }
    }
}
