package BankActions;

import Models.Purchase;

import java.util.Scanner;

public class RegisterPurchaseItem {
    public Purchase doPurchase(){
        Scanner purchaseReading = new Scanner(System.in);
        System.out.println("Type a name for this item");
        String name = purchaseReading.nextLine();
        System.out.println("Which value?");
        double value = purchaseReading.nextDouble();
        return new Purchase(name, value);
    }

}
