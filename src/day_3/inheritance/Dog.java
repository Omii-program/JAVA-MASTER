package day_3.inheritance;

public class Dog extends Animal{
    private String name;

    Dog(String name){
        this.name=name;
    }
    public void useSuper(int legs){
        super.legs=legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
