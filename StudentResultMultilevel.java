class Student {
    String name;
    int rollNo;

    void getDetails(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void putDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

class Test extends Student {
    int mark1, mark2;

    void getMarks(int m1, int m2) {
        this.mark1 = m1;
        this.mark2 = m2;
    }

    void putMarks() {
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
    }
}

class Result extends Test {
    float total;

    void calculateAndDisplay() {
        total = mark1 + mark2;
        putDetails(); 
        putMarks();   
        System.out.println("Total Score: " + total);
    }
}

public class StudentResultMultilevel {
    public static void main(String[] args) {
        Result studentResult = new Result();
        
        studentResult.getDetails("John Doe", 101);
        studentResult.getMarks(85, 90);
        
        studentResult.calculateAndDisplay(); 
    }
}
