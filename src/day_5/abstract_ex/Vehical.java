package day_5.abstract_ex;

public abstract class Vehical {
    final static String machineName="Vehical";
    static int total_vehical=0;
    int wheels;
    int speed;
    Vehical(){
        total_vehical++;
    }
    Vehical(int wheels){
        this.wheels=wheels;
        total_vehical++;
    }

    abstract void start();

    abstract void fuelType();

    abstract String vehicalType();

    public void running(){
        System.out.println("Vehical is running");
    }

    static final void useFor(){
        System.out.println("Vehical used for Transportation...");
    }

    static int getTotal_vehical(){
        return total_vehical;
    }
}
