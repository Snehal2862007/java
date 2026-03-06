package ex3;

class Grandparent {
    void showGrandparent() {
        System.out.println("I am Grandparent");
    }
}

class Parent extends Grandparent {
    void showParent() {
        System.out.println("I am Parent");
    }
}

class Child extends Parent {
    void showChild() {
        System.out.println("I am Child");
    }
}

public class MultilevelTest {
    public static void main(String[] args) {

        Child c = new Child();

        c.showGrandparent();
        c.showParent();
        c.showChild();
    }
}