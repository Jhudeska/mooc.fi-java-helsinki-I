import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grade grade = new Grade();
        
        // Get scores from input
        System.out.println("Type exam scores, -1 completes:");
        int score;
        while (true) {
            score = scanner.nextInt();
            if (score == -1) break;
            if (score >= 0 && score <= 60) grade.addScore(score);
        }
        
        // Calculate grade distribution
        grade.getGrades();
        
        // Print grade distribution
        grade.printGradeDistribution();
        
        // Print acceptance percentage
        System.out.println("Acceptance percentage: " + grade.acceptancePercentage());
    }
}
