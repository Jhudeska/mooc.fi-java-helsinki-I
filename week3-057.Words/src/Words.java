import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
<<<<<<< HEAD
        // Get initial input
        System.out.print("Type a word: ");
        String inputString = reader.nextLine();
        
        while (!inputString.isEmpty()) {
            words.add(inputString);
            // Get new input
            inputString = reader.nextLine();
        }
        
        // Display inputted words
        System.out.println("You typed the following words: ");
        for (String word : words) {
            System.out.println(word);
=======
        int i = 0;
        String word;
        
        System.out.print("Type a word: ");
        word = reader.nextLine();
        
        // Add words to arraylist
        while (!(word.isEmpty())) {
            words.add(word);
            System.out.print("Type a word: ");
            word = reader.nextLine();
        }
        
        // Display words in arraylist
        System.out.println("You type the following words:");
        /*
        while (i < words.size()) {
            System.out.println(words.get(i));
            i++;
        }
        */
        for (String w : words) {
            System.out.println(w);
>>>>>>> 878abd00adfbb5ebc92ac02842c431202e90a90a
        }
    }
}
