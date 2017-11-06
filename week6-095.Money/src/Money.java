
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added) {
        int sumEuros = euros + added.euros();
        int sumCents = cents + added.cents();
        
        if (sumCents > 100) {
            sumEuros++;
            sumCents -= 100;
        }
        
        Money sum = new Money(sumEuros, sumCents);
        
        return sum;
    }
    
    public boolean less(Money compared) {
        return euros < compared.euros() || 
                (euros == compared.euros() && cents < compared.cents());
    }
    
    public Money minus(Money decremented) {
        int diffEuros = euros - decremented.euros();
        int diffCents = cents - decremented.cents();
        
        if (diffCents < 0) {
            diffEuros--;
            diffCents += 100;
        }
        
        if (diffEuros < 0) {
            diffEuros = 0;
            diffCents = 0;
        }
        
        Money diff = new Money(diffEuros, diffCents);
        
        return diff;
    }

}
