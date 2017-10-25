import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        this.numbers = new ArrayList<Integer>();
        this.random = new Random();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // Clear number list for fresh draw
        numbers.clear();
        // Write the number drawing here using the method containsNumber()
        int i = 0;
        int randomNum;
        while (i < 7) {
            randomNum = 1 + random.nextInt(39);
            if (!containsNumber(randomNum)) {
                numbers.add(randomNum);
                i++;
            }
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        return numbers.contains(number);
    }
}
