package day_2;

public class App {
    public static void main(String[] args) {

        Employee e1=new Employee();
        e1.setId(101);
        e1.setName("JOHN");
        e1.setSalary(50000);

        e1.display();

        // Parameterized Constructor
        Employee e2=new Employee(102,"SAM",35000);

        e2.display();
        Employee.showCount();
    }
}
