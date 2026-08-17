package day_5.interface_ex;

public class UPI implements Payment{
    @Override
    public void paymentMethod() {
        System.out.println("Payment Via UPI...");
    }
}
