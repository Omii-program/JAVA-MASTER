package day_5.abstract_ex;

public class App {

    public static void main(String[] args) {


        Bike b1 = new Bike("Bike", 2);
        b1.display();

       // Vehical v1=new Vehical();--> cant create object of abstract class
        //Vehical v2=new Bike();--> true, we can create reference of abstract class...but rearly use it
        // v2.display();-->parent reference cannot access Child properties

        System.out.println("****************************************");
        Car c1=new Car(4,true);

        c1.display();

    }


}
