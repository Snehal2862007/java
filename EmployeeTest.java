class employee {

    
    private String firstName;
    private String lastName;
    private double monthlySalary;

   
    public employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
    public double getYearlySalary() {
        return monthlySalary * 12;
    }
}
public class employeeTest {

    public static void main(String[] args) {
        employee emp1 = new employee("Rahul", "Sharma", 25000);
        employee emp2 = new employee("Neha", "Patel", 30000);
        System.out.println("Yearly Salaries Before Raise:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + ": " + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + ": " + emp2.getYearlySalary());

    
        emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.10);
        emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.10);
        System.out.println("\nYearly Salaries After 10% Raise:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + ": " + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + ": " + emp2.getYearlySalary());
    }
}
