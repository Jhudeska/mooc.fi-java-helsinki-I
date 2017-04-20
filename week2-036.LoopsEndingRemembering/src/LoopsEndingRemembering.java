import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);

        // Declare variables
        int num = 0;
        
        // Get input
        while (num != -1) {
            System.out.print("Type numbers: ");
            num = Integer.parseInt(reader.nextLine());
        }
        
        // End
        System.out.println("Thank you and see you later!");
    }
}
