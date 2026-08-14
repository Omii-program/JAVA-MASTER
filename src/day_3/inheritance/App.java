package day_3.inheritance;

public class App {
    public static void main(String[] args) {


        Cat c1 = new Cat(4, "Lussi");

        Dog d1 = new Dog("Peter");
        d1.useSuper(4);

        d1.sound();

        c1.display();
    }
}
