
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String word1, word2;
        int index;
        
        // Get words from input
        System.out.print("Type the first word: ");
        word1 = reader.nextLine();
        System.out.print("Type the second word: ");
        word2 = reader.nextLine();
        
        index = word1.indexOf(word2);
    }
}
