package day_3.inheritance;

public class Animal {

    protected int legs;
    Animal(){}
    Animal(int legs){
        this.legs=legs;
    }
    public void sound(){
        System.out.println("Animal make sound...");
    }
}
