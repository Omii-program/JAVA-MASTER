package day_3.inheritance;

public class App {
    public static void main(String[] args) {


        Cat c1 = new Cat(4, "Lussi");

        Dog d1 = new Dog("Peter");
        d1.useSuper(4);

       // d1.sound();

        c1.display();

        Animal a1=new Cat();//7. Why Does Runtime Polymorphism Happen?
        a1.sound();//Because Java decides the overridden method based on the actual object at runtime, not just the reference type.

         Cat c2=new Cat();
         c2.sound();//--> it will always call Cat sound()... we can't call Animal sound() using Cat c2 reference

        System.out.println(a1.x);//--> the reference is created of Animal thats why it acces Animal x



    }
}
