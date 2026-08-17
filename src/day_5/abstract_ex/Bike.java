package day_5.abstract_ex;

public class Bike extends Vehical{

    private String name;
    Bike(){}
    Bike(String name,int wheel){
        super(wheel);
        this.name=name;
    }

    @Override
    void start() {
        System.out.println("Bike starts using Kick");
    }

    @Override
    void fuelType() {
        System.out.println("Petrol feul");
    }

    @Override
    String vehicalType() {
        return this.name;
    }

    void stop(){
        System.out.println(" Bike stop");
    }
    void setSpeed(int speed){
        super.speed=speed;
    }
    int getSpeed(){
        return super.speed;
    }

    void display(){
        System.out.println("Vehical Type is: "+vehicalType());
        start();
        fuelType();
        super.running();
        Vehical.useFor();
        stop();
        System.out.println("Speed is: "+getSpeed());
    }

}
