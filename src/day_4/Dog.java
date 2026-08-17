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

    final String name;//--> can assign only one time.. wheater using constructor or direct name="Jack"
    Dog(String name){
        this.name=name;
    }/*
    void setName(String name){
        this.name=name; //-->Cannot assign a value to final variable 'name'
    }*/
}
