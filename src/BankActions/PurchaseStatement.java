package BankActions;

import Models.Purchase;

import java.util.ArrayList;

public class PurchaseStatement {

    public int getAmountOfPurchases(ArrayList<Purchase> purchases){
        return purchases.size();
    }

    public double getTotalPurchaseValue(ArrayList<Purchase> purchases){
        double totalValue = 0;
        if (purchases.size() > 0){
            for (Purchase item : purchases){
                totalValue += item.getPurchaseValue();
            }
        }
        return totalValue;
    }

    public double getCreditCardAvaliableLimit(double creditCardLimit, double totalPurchaseValue){
        return creditCardLimit - totalPurchaseValue;
    }

}
