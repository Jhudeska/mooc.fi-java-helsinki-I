
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int guess;
        int guessCount = 0;
        
        while (true) {
            // Get guess from input
            System.out.print("Guess a number: ");
            guess = Integer.parseInt(reader.nextLine());
            
            guessCount++;
            
            if (guess > numberDrawn) {
                System.out.print("The number is lesser, guesses made: " + guessCount);
            } else if (guess < numberDrawn) {
                System.out.print("The number is greater, guesses made: " + guessCount);
            } else {
                break;
            }
        }
        
        System.out.println("Congratulations, your guess is correct!");
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
