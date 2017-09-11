
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        
        System.out.print("Type a word: ");
        String input = reader.nextLine();
        
        while (!input.isEmpty()) {
            words.add(input);
            // Get new input
            System.out.print("Type a word: ");
            input = reader.nextLine();
        }
        
        // Sort words
        Collections.sort(words);
        
        // Display sorted words
        System.out.println("You typed the following words: ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
