
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Declare variables
        int age;
        
        // Get age from input
        System.out.print("How old are you? ");
        age = Integer.parseInt(reader.nextLine());
        
        // Check if reasonable age
        if (age >= 0 && age <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
