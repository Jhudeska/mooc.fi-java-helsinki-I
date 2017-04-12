
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Declare variables
        int radius;
        double circumference;
        
        // Get radius from user
        System.out.print("Type the radius: ");
        radius = Integer.parseInt(reader.nextLine());
        
        // Calculate circumference
        circumference = 2 * Math.PI * radius;
        
        // Display result
        System.out.println("Circumference of the circle: " + circumference);
    }
}
