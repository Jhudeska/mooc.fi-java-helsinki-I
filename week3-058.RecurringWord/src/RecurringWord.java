
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();
        String input;
        
        while (true) {
            System.out.print("Type a word: ");
            input = reader.nextLine();
            
            // See if input string is found in arraylist
            if (words.contains(input)) {
                System.out.println("You gave the word " + input + " twice");
                break;
            } else {
                words.add(input);
            }
        }
    }
}
