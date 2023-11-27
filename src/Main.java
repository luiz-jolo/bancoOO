import BankActions.PurchaseStatement;
import BankActions.RegisterPurchaseItem;
import Models.Purchase;
import Validators.CreditValidator;
import Models.CreditCard;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);
        //Limit defined statically
        CreditCard cardOne = new CreditCard(1000);
        PurchaseStatement purchaseStatement = new PurchaseStatement();

        String menu = """
                💰💰💰 OO Bank 💰💰💰
                --- Type an operation ---
                1 - Register a purchase
                2 - Report
                3 - Exit
                """;
        int optionEntered = 0;
        ArrayList<Purchase> shopping = new ArrayList<>();

        while (optionEntered != 3){
            System.out.println(menu);
            optionEntered = reading.nextInt();
            switch (optionEntered) {
                case 1 -> {
                    Purchase myPurchase = new RegisterPurchaseItem().doPurchase();
                    boolean validatePurchase = new CreditValidator().validateBalance(1000,myPurchase.getPurchaseValue());

                    if(validatePurchase){
                        shopping.add(myPurchase);
                    }else {
                        System.out.println("Você não tem limite para esta compra");
                    }
                }
                case 2 -> {
                    System.out.println("Você realizou " + purchaseStatement.getAmountOfPurchases(shopping) + " compras.");
                    System.out.println("Seu limite disponível é de: " + purchaseStatement.getCreditCardAvaliableLimit(cardOne.getLimit(), purchaseStatement.getTotalPurchaseValue(shopping)));
                }
            }
        }
    }
}