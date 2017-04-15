
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        // Declare variables
        double temperature;

        while (true) {
            // Get number from input
            temperature = Double.parseDouble(reader.nextLine());
         
            if (temperature >= -30 && temperature <=40) {
                Graph.addNumber(temperature);
        
            }
        }
    }
}