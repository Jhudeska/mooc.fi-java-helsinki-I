
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BirdDatabase db = new BirdDatabase();
        
        while (true) {
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Latin Name: ");
                String latinName = scanner.nextLine();
                db.addBird(name, latinName);
            } else if (command.equalsIgnoreCase("Observation")) {
                System.out.print("What was observed:? ");
                String name = scanner.nextLine();
                db.addObservation(name);
            } else if (command.equalsIgnoreCase("Statistics")) {
                db.printAllBirds();
            } else if (command.equalsIgnoreCase("Show")) {
                System.out.print("What? ");
                String name = scanner.nextLine();
                db.printBird(name);
            } else if (command.equalsIgnoreCase("Quit")) {
                break;
            }
        }
    }

}
