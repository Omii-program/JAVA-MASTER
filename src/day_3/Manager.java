package day_3;

public class Manager extends Employee {
    private String department;
    private int team_size;

    Manager() {
    }

    Manager(String department, int team_size) {
        this.department = department;
        this.team_size = team_size;

    }

    Manager(int emp_id, double salary, String department, int team_size) {
        super(emp_id, salary);
        this.department = department;
        this.team_size = team_size;

    }

    Manager(String name, int age, int emp_id,double salary,String department,int team_size){
        super(name,age,emp_id,salary);
        this.department=department;
        this.team_size=team_size;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getTeam_size() {
        return team_size;
    }

    public void setTeam_size(int team_size) {
        this.team_size = team_size;
    }

    public void display(){
        super.display();
        System.out.println("DEPARTMENT: "+department);
        System.out.println("TEAM_SIZE: "+team_size);
        System.out.println("TOTAL EMPLOYEE COUNT: "+emp_cnt);
    }
}
