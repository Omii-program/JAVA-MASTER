package day_3;

public class App {

    public static void main(String[] args) {

        Manager m1=new Manager("Rahul",25,101,50000,"IT",8);
        m1.display();

        System.out.println("*********************************");
        Person p1=new Person("Amit",32);

        // HAS-A Relationship
        Employee e1=new Employee(p1,102,25000);

        e1.display();

        System.out.println("********************************");
        Person p2=new Manager("Kishan",27,103,60000,"IT",20);

        p2.display();

        System.out.println(m1.getName());/* --> execute hoga kyu ki Manager Person class ko extend krta hai.... to uski sari feilds and method ko acces krta hai

        /* p2.getDepartment();--> it will give an error. beacause Person ka reference kisi getDepartment ko janta nahi*/
        //Baki PArt Polymorphism me samjega...

        /* Q]   Why Does Runtime Polymorphism Happen?
                Because Java decides the overridden method based on the actual object at runtime, not just the reference type.*/

    }
}
