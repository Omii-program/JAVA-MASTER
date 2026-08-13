package day_2;

public class Employee {

private int id;
private String name;
private double salary;

 final protected String Company=" LALA Infotech pvt";

protected static int emp_cnt=0;

static {
    System.out.println("This is static block...");
    System.out.println("It exectute firt at the time of class loading");
    System.out.println("WELCOME  EMPLOYEE !!!");
}

Employee(){
      emp_cnt+=1;
}
// Parameterized Constructor
Employee(int id, String name, double salary){
    this.id=id;
    this.name=name;
    this.salary=salary;
    emp_cnt+=1;
}
//Constructor Overloading
Employee(int id,String name){
    this.id=id;
    this.name=name;
    emp_cnt+=1;
}

    public int getId() {
        return id;
    }

    public void setId(int id){
    this.id=id;
    }
    public String getName(){
    return name;
    }
    public void setName(String name){
    this.name=name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return Company;
    }

    public static void  showCount(){
        System.out.println("Employee Count is: "+emp_cnt);
    }


    public void display(){
        System.out.println("ID: "+this.id);
        System.out.println("NAME: "+this.name);
        System.out.println("SALARY: "+this.salary);
        System.out.println("COMPANY: "+Company);

    }

}
