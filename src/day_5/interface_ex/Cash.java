package day_5.interface_ex;

public class Cash implements Payment{
    int rs;
    Cash(){

    }

    Cash(int rs){
        this.rs=rs;
    }
    @Override
    public void paymentMethod() {
        System.out.println("Payment Via Cash...");
    }

    void display(){
        System.out.println("Rs is: "+rs);
    }
}
