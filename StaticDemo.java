class StaticDemo {
    static int count;

    static {
        count = 100;
        System.out.println("Static Block Executed");
    }
    static void display() {
        System.out.println("Count = " + count);
    }

    public static void main(String[] args) {

        System.out.println("Main Method Started");

        StaticDemo.display();
    }
}
