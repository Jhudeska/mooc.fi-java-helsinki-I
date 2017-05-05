import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        String word;
        
        // Get input
        while (true) {
            System.out.print("Type a word: ");
            word = reader.nextLine();
            if (word.isEmpty()) {
                break;
            }
            words.add(word);
        }
        
        // Reverse arraylist
        Collections.reverse(words);
        
        // Print reversed arraylist
        System.out.println("You typed the following words: ");
        
    }
}
