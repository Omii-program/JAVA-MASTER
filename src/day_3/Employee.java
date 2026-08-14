package day_3;

public class Employee extends Person{
    private int emp_id;
    private double salary;
    protected static int emp_cnt=0;

    Employee(){
    }

    Employee(int emp_id,double salary){
                this.emp_id=emp_id;
                this.salary=salary;
                emp_cnt++;
    }
    Employee(Person obj, int emp_id, double salary){
        super(obj);
        this.emp_id=emp_id;
        this.salary=salary;
        emp_cnt++;

    }
    Employee(String name, int age, int emp_id,double salary){
        super(name,age);
        this.emp_id=emp_id;
        this.salary=salary;
        emp_cnt++;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getEmp_cnt() {
        return emp_cnt;
    }
    public void display(){
        super.display();
        System.out.println("EMP_ID: "+emp_id);
        System.out.println("SALARY: "+salary);
    }
}
