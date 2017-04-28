import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String name;
        
        System.out.print("Type your name: ");
        name = reader.nextLine();
        
        if (name.length() >= 3) {
            System.out.print("1. character: " + name.charAt(0));
            
        }
        
    }
}
