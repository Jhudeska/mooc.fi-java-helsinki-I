public class Counter {
    private int counterValue;
    private boolean check;
    
    public Counter(int startingValue, boolean check) {
        this.counterValue = startingValue;
        this.check = check;
    }
    
    public Counter(int startingValue) {
        this(startingValue, false);
    }
    
    public Counter(boolean check) {
        this(0, check);
    }
    
    public Counter() {
        this(0, false);
    }
    
    public int value() {
        return counterValue;
    }
    
    public void increase() {
        counterValue++;
    }
    
    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            counterValue += increaseAmount;
        }
    }
    
    public void decrease() {
        counterValue--;
        if (check && counterValue < 0) {
            counterValue = 0;
        }
    }
    
    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            counterValue -= decreaseAmount;
            if (check && counterValue < 0) {
                counterValue = 0;
            }
        }
    }
}
