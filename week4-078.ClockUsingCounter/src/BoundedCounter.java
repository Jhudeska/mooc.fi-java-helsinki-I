public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }
    
    public void next() {
        if (value + 1 > upperLimit) {
            value = 0;
        } else {
            value++;
        }
    }
    
    public String toString() {
        if (value < 10) {
            return "0" + value;
        } else {
            return "" + value;
        }
    }
    
    public int getValue() {
        return value;
    }
    
    public void setValue(int newValue) {
        if (newValue > 0 && newValue <= upperLimit) {
            value = newValue;
        }
    }
}
