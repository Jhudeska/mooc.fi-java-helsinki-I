
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int guess;
        
        // Get guess from input
        System.out.print("Guess a number: ");
        guess = Integer.parseInt(reader.nextLine());
        
        while (guess != numberDrawn) {
            if (guess > numberDrawn) {
                System.out.println("The number is lesser");
            } else if (guess < numberDrawn) {
                System.out.println("The number is greater");
            }
            System.out.print("Guess a number: ");
            guess = Integer.parseInt(reader.nextLine());
        }
        
        System.out.println("Congratulations, your guess is correct!");
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
