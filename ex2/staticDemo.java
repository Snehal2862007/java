package ex2;

public class staticDemo {

    static int x;

    static{
        x=10;
        System.out.println("Static Block Executed");
    }

    static void show(){
        System.out.println("Value of x: "+x);
    }

    public static void main(String[] args){
        show();
    
    }
}