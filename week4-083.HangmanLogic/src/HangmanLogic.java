
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess

        // if the letter has already been guessed, nothing happens
        if (!guessedLetters.contains(letter)) {
            // if the word does not contains the guessed letter, number of faults increase
            if (!word.contains(letter)) {
                numberOfFaults++;
            }
            // the letter is added among the already guessed letters
            guessedLetters += letter;
        }
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word
        String hiddenWord = "";
        String currLetter = "";
        // create the hidden word by iterating through this.word letter by letter
        for (int i = 0; i < word.length(); i++) {
            currLetter = "" + word.charAt(i);
            if (guessedLetters.contains(currLetter)) {
                hiddenWord += currLetter;
            } else {
                hiddenWord += "_";
            }
        }

        // return the hidden word at the end
        return hiddenWord;
    }
}
