import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
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
        while (i < words.size()) {
            System.out.println(words.get(i));
            i++;
        }
    }
}
