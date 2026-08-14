package day_3;

public class Person {
    private String name;
    private int age;

    Person(){

    }
    Person(Person obj){
        this.name=obj.name;
        this.age=obj.age;

    }
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public void display(){
        System.out.println("NAME :"+name);
        System.out.println("AGE :"+age);
    }
}
