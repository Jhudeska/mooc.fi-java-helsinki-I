
import java.util.ArrayList;

public class Grade {
    private ArrayList<Integer> scores;
    private int[] grades;  // Stores grade counts (indices as grades)
    private int acceptCount;
    
    public Grade() {
        scores = new ArrayList<Integer>();
        grades = new int[6];
    }
    
    public void addScore(int score) {
        scores.add(score);
    }
    
    public void getGrades() {
        for (int score : scores) {
            if (score < 30) {
                grades[0]++;
            } else if (score < 35) {
                grades[1]++;
                acceptCount++;
            } else if (score < 40) {
                grades[2]++;
                acceptCount++;
            } else if (score < 45) {
                grades[3]++;
                acceptCount++;
            } else if (score < 50) {
                grades[4]++;
                acceptCount++;
            } else if (score <= 60) {
                grades[5]++;
                acceptCount++;
            }
        }
    }
    
    public void printGradeDistribution() {
        System.out.println("Grade distribution:");
        for (int grade = 5; grade >= 0; grade--) {
            System.out.print(grade + ": ");
            printStars(grades[grade]);
            System.out.println();
        }
    }
    
    public static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
    }
    
    public double acceptancePercentage() {
        if (scores.size() > 0) {
            return 100 * acceptCount / scores.size();
        }
        return 0;
    }
}
