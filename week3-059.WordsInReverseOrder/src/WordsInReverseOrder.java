import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 878abd00adfbb5ebc92ac02842c431202e90a90a
        ArrayList<String> words = new ArrayList<String>();
        String input;
        
        // Get input
        while (true) {
            System.out.print("Type a word: ");
            input = reader.nextLine();
            if (input.isEmpty()) {
                break;
            }
            words.add(input);
        }
        
        // Reverse arraylist
        Collections.reverse(words);
        
        // Print reversed arraylist
        System.out.println("You typed the following words: ");
        for (String word : words) {
            System.out.println(word);
        }
<<<<<<< HEAD
>>>>>>> origin/master
=======
>>>>>>> 878abd00adfbb5ebc92ac02842c431202e90a90a
    }
}
