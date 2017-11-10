
public class Bird {
    private String name;
    private String latinName;
    private int observationCount;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observationCount = 0;
    }
    
    public String getName() {
        return name;
    }
    
    public void increaseObservation() {
        observationCount++;
    }
    
    @Override
    public String toString() {
        return name + "(" + latinName + "): " + observationCount + " observations";
    }
}
