package day_5.interface_ex;

public class App {
    public static void main(String[] args) {

        Payment p1=new Cash(5);//lazy loading
        p1.paymentMethod();
/*We use the interface reference (Payment p1 = new Cash(5);)
 despite losing access to subclass-specific methods like display() because it enforces loose coupling and flexibility.
 */
        Cash c1=new Cash();//early binding
        c1.paymentMethod();
        c1.display();


        PaymentFactory f1=new PaymentFactory();// here we see loosly coupled code. at the time of running we select uor payment method
        Payment p2= f1.getPaymentMethod("upi");

        p2.paymentMethod();
    }
}
