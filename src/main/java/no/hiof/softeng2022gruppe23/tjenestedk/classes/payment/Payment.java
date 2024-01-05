package no.hiof.softeng2022gruppe23.tjenestedk.classes.payment;

// Simple class to represent a payment solution for our service, only for demonstration purposes
public class Payment {
    public static boolean makePayment(String paymentMethod, int amount, boolean enoughMoneyInBankAccount) {
        if (paymentMethod ==  "paypal") {
            return paymentMethodsAPI(amount, enoughMoneyInBankAccount);
        }
        else if (paymentMethod == "stripe") {
            return paymentMethodsAPI(amount, enoughMoneyInBankAccount);
        }
        else if (paymentMethod == "vipps") {
            return paymentMethodsAPI(amount, enoughMoneyInBankAccount);
        }
        else {
            return false;
        }
    }
    // In reality all the payment methods would have it own API, but for the sake of this example we will use one.
    public static boolean paymentMethodsAPI(int amount, boolean enoughMoneyInBankAccount) {
        return bankTransactionAPI(amount, enoughMoneyInBankAccount);
    }
    // This whould not be handeled by us, but for the sake of this example we will use it.
    public static boolean bankTransactionAPI(int amount, boolean enoughMoneyInBankAccount) {
        int amountOfMoneyInBankAccount;
        if (enoughMoneyInBankAccount) {
            amountOfMoneyInBankAccount = amount;
        } else {
            amountOfMoneyInBankAccount = 0;
        } return amountOfMoneyInBankAccount >= amount;
    }
}
