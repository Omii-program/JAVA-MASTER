package day_4;

public class Cat extends Animal {
    @Override
    public void sound(){
        System.out.println("Cat Make sound...MEAOW");
    }
    public void eat(String milk){
        System.out.println("Cat is Eating.."+milk);
    }
    public void eat(String milk,String biscute){
        System.out.println("Cat is Eating.."+milk+" "+biscute);
    }

    int age=1;
   public static int legs=2;
    public void getLegs(){
        System.out.println("Legs are: "+super.legs);
    }
    void getAge(){
        System.out.println("Age is: "+super.age);
    }
}
