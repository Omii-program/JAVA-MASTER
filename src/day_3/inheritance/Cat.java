package day_3.inheritance;

public class Cat extends Animal{
    int x=1;
    private String name;
    Cat(){

    }
    Cat(int legs,String name){
          super(legs);
          this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sound(){
        System.out.println("MEAOW...");
    }

    public void display(){
        System.out.println("NAME: "+name);
        System.out.println("LEGS: "+super.legs);
    }
}
