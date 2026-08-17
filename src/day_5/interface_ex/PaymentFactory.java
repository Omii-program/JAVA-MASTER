package day_5.interface_ex;

public class PaymentFactory {

    String paymentMethod;

    PaymentFactory(){

    }
    PaymentFactory(String paymentMethod){
        this.paymentMethod=paymentMethod;

    }

    public Payment getPaymentMethod(String paymentMethod) {

        if(paymentMethod.equalsIgnoreCase("cash")) {
            return new Cash();
        } else if (paymentMethod.equalsIgnoreCase("creditcard")) {
            return new CreditCard();
        } else if (paymentMethod.equalsIgnoreCase("upi")) {
            return new UPI();
        }

        return null;
    }
}
