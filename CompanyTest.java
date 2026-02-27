class Employee {

    String name;
    String address;
    double salary;
    String jobTitle;

    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    double calculateBonus() {
        return salary * 0.10;
    }

    void performanceReport() {
        System.out.println(jobTitle + " " + name + " Performance: Excellent");
    }

    void manageProject() {
        System.out.println(name + " is managing a project.");
    }
}

class Manager extends Employee {
    Manager(String n, String a, double s) {
        super(n, a, s, "Manager");
    }
}

class Developer extends Employee {
    Developer(String n, String a, double s) {
        super(n, a, s, "Developer");
    }
}

class Programmer extends Employee {
    Programmer(String n, String a, double s) {
        super(n, a, s, "Programmer");
    }
}

public class CompanyTest {
    public static void main(String[] args) {

        Manager m = new Manager("Snehal", "Mumbai", 80000);
        Developer d = new Developer("Rahul", "Pune", 60000);
        Programmer p = new Programmer("Amit", "Delhi", 50000);

        m.performanceReport();
        System.out.println("Bonus: " + m.calculateBonus());

        d.performanceReport();
        System.out.println("Bonus: " + d.calculateBonus());

        p.performanceReport();
        System.out.println("Bonus: " + p.calculateBonus());
    }
}
