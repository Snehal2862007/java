class Student {
    int rollNo;

    void setRollNo(int r) {
        rollNo = r;
    }

    int getRollNo() {
        return rollNo;
    }
}

class Test extends Student {
    int sub1, sub2;

    void setMarks(int m1, int m2) {
        sub1 = m1;
        sub2 = m2;
    }

    int getMarks() {
        return sub1 + sub2;
    }
}

interface Sports {
    int sMarks = 50;

    void set();
}

class Result extends Test implements Sports {

    public void set() {
        System.out.println("Sports Marks: " + sMarks);
    }

    void display() {
        int total = getMarks() + sMarks;
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total Marks: " + total);
    }
}

public class ResultTest {
    public static void main(String[] args) {

        Result r = new Result();

        r.setRollNo(101);
        r.setMarks(70, 80);
        r.set();
        r.display();
    }
}