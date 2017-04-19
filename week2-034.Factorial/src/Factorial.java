import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Declare variables
        int inputNum, factorial, i;
        
        // Initialize variables
        i = 1;
        factorial = 0;
        
        // Get number from input
        System.out.print("Type a number: ");
        inputNum = Integer.parseInt(reader.nextLine());
        
        // Calculate factorial
        while (i <= inputNum) {
            factorial *= i;
        }
        
        if (inputNum == 0) {
            factorial = 1;
        }
        
        // Display factorial
        System.out.println("Factorial is " + factorial);
    }
}
