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
        
        while (!(word.isEmpty())) {
            words.add(word);
            System.out.print("Type a word: ");
            word = reader.nextLine();
        }
        
        // Print each word in 'words'
    }
}
