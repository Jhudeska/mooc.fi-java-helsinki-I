
import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> birds;
    
    public BirdDatabase() {
        birds = new ArrayList<Bird>();
    }
    
    public void addBird(String name, String latinName) {
        Bird b = new Bird(name, latinName);
        birds.add(b);
    }
    
    public void addObservation(String name) {
        for (Bird b : birds) {
            if (b.getName().equalsIgnoreCase(name)) {
                b.increaseObservation();
                return;
            }
        }
        System.out.println("Is not a bird!");
    }
    
    public void printAllBirds() {
        for (Bird b : birds) {
            System.out.println(b);
        }
    }
    
    public void printBird(String name) {
        for (Bird b : birds) {
            if (b.getName().equalsIgnoreCase(name)) {
                System.out.println(b);
                return;
            }
        }
        System.out.println("Is not a bird!");
    }
}
