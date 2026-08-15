package day_4;

public class IMP {
    IMP(){

    }
    /*
    13. Important Interview Questions
Q1. What is polymorphism?

Answer:

Polymorphism is an OOP concept where one method or interface can have multiple forms or behaviors. In Java, polymorphism is mainly achieved through method overloading and method overriding.

Q2. What is method overloading?

Method overloading occurs when multiple methods have the same name but different parameter lists within the same class.

Q3. What is method overriding?

Method overriding occurs when a child class provides its own implementation of a method already defined in the parent class with the same method signature.

Q4. What is runtime polymorphism?

Runtime polymorphism is the process where the method implementation is determined at runtime based on the actual object rather than the reference type.

Example:

Animal a = new Dog();
a.sound();
Q5. Why does runtime polymorphism happen?

Because Java uses dynamic method dispatch for overridden instance methods.

The actual object's method is selected at runtime.

Animal a = new Dog();

Although the reference is Animal, the object is Dog, so:

a.sound();

calls:

Dog.sound();
Q6. Can we override a static method?

No, static methods are not overridden.

They are hidden.

Q7. Can we override a private method?

No.

Private methods are not inherited by the child class, so they cannot be overridden.

Q8. Can we override a final method?

No.

A final method cannot be overridden.

Q9. Can constructors be overridden?

No.

Constructors are not inherited, so they cannot be overridden.
     */
    public void notes(){
        System.out.println(" ");
    }
}
