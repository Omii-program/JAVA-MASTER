package day_4;

public class App {
    public static void main(String[] args) {

        Animal a1=new Cat();

        a1.sound();//-->Method Overriding
        //a1.eat("milk");--> Method is not belong to Animal class

        Cat c1=new Cat();
        c1.sound();
        c1.eat("milk 200ml");//--> Method Overloading
        c1.eat("milk 250ml ","4 biscute");


        Animal a2=new Dog();
        a2.sound();
        //a2.eat("milk");-->Method is not belong to Animal class

        Dog d1=new Dog();
        d1.sound();
        d1.eat("milk");
        System.out.println( d1.eat("milk","Chapati"));


    }
}
