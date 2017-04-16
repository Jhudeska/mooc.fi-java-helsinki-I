
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable


        // Get numbers from user and add to sum
        System.out.print("Type the first number: ");
        read = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type the second number: ");
        read = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type the third number: ");
        read = Integer.parseInt(reader.nextLine());

        // Display sum
        System.out.println("Sum: " + sum);
    }
}
