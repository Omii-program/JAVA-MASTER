package day_5.abstract_ex;

public class Car extends Vehical {

    boolean seatbelt;

    Car(){

    }
    Car(int wheels,boolean seatbelt){
        super(wheels);
        this.seatbelt=seatbelt;
    }
    @Override
    void start(){
        System.out.println("Car is Starts...");
    }

    @Override
    void fuelType() {
        System.out.println(" feul is :CNG");
    }

    @Override
    String vehicalType() {
        return "Car";
    }
    public void setSeatbelt(boolean seatbelt){
        this.seatbelt=seatbelt;
    }
    public boolean isSeatbelt(){
        return seatbelt;
    }
    void display(){
        System.out.println("Vehecal Type: "+vehicalType());
        start();
        fuelType();
        System.out.println("have seatbelt: "+isSeatbelt());
    }


}
