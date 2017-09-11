
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();
        
        System.out.print("Type a word: ");
        String input = reader.nextLine();
        
        while (!words.contains(input)) {
            words.add(input);
            // Get new word from input
            System.out.print("Type a word: ");
            input = reader.nextLine();
        }
        
        System.out.println("You gave the word " + input + " twice");
    }
}
