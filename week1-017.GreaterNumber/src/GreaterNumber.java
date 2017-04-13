import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Declare variables
        int a, b;
        
        // Get numbers from input
        System.out.print("Type the first number: ");
        a = Integer.parseInt(reader.nextLine());
        System.out.print("Type the second number: ");
        b = Integer.parseInt(reader.nextLine());
        
        // Check for greater number, or if numbers are equal
        if (a > b) {
            System.out.println("Greater number: " + a);
        } else if (b > a) {
            System.out.println("Greater number: " + b);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
