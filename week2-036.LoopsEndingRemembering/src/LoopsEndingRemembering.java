import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);

        // Declare variables
        int num = 0;
        int sum = 0;
        int count = 0;
        int oddCount = 0;
        int evenCount = 0;
        double average = 0;
        
        // Get input
        System.out.print("Type numbers: ");
        num = Integer.parseInt(reader.nextLine());
        while (num != -1) {
            sum += num;
            if (num % 2 ==0) {
                evenCount++;
            } else {
                oddCount++;
            }
            count++;
            System.out.print("Type numbers: ");
            num = Integer.parseInt(reader.nextLine());
        }
        
        average = (double) sum / count;
        
        // Display results
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
