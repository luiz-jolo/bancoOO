package Models;

public class Purchase {

    private String title;
    private double purchaseValue;

    public Purchase(String title, double purchaseValue){
        this.title = title;
        this.purchaseValue = purchaseValue;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPurchaseValue() {
        return purchaseValue;
    }

    public void setPurchaseValue(double purchaseValue) {
        this.purchaseValue = purchaseValue;
    }
}
