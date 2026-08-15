package day_4;

public class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog Make Sound...BHAAUV");
    }
    public void eat(String food1){
        System.out.println("Dog is eating.."+food1);
    }
    public boolean eat(String food1, String food2){
        System.out.println("Dog did his food.."+food1+" and "+food2);
        return true;
    }
}
