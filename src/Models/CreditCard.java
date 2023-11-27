package Models;

public class CreditCard {
    private final double limit;

    public CreditCard(double limit){
        this.limit = limit;
    }

    public double getLimit(){
        return this.limit;
    }
}
