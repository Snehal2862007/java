import java.util.Scanner;

class Area {

    private double length;
    private double breadth;
    public void setvalue(double l, double b) {
        length = l;
        breadth = b;
    }

    public double getArea() {
        return length * breadth;
    }
}

public class AreaTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Area rect = new Area();

  
        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();


        rect.setvalue(l, b);


        System.out.println("Area of Rectangle = " + rect.getArea());

        sc.close();
    }
}
