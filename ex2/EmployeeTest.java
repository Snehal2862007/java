package ex2;
class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    Employee(String f, String l, double s){
        firstName=f;
        lastName=l;
        setSalary(s);
    }

    public void setSalary(double s){
        if(s>0)
            monthlySalary=s;
        else
            monthlySalary=0.0;
    }

    public double getSalary(){
        return monthlySalary;
    }

    public double yearlySalary(){
        return monthlySalary*12;
    }

    public void raise(){
        monthlySalary+=monthlySalary*0.10;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {

        Employee e1=new Employee("Snehal","Dalvi",20000);
        Employee e2=new Employee("Rahul","Sharma",25000);

        System.out.println("Yearly Salary 1: "+e1.yearlySalary());
        System.out.println("Yearly Salary 2: "+e2.yearlySalary());

        e1.raise();
        e2.raise();

        System.out.println("After 10% Raise:");
        System.out.println("Yearly Salary 1: "+e1.yearlySalary());
        System.out.println("Yearly Salary 2: "+e2.yearlySalary());
     
    }
}
