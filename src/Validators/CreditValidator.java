package Validators;

public class CreditValidator {

    public boolean validateBalance(double creditLimit, double purchaseIntentValue){
        return creditLimit >= purchaseIntentValue;
    }
}
