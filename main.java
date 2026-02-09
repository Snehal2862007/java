import java.util.Scanner;

public class Main {

    static class Stack {


        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        Node top = null;


        void push(int value) {
            Node newNode = new Node(value);

            newNode.next = top;
            top = newNode;

            System.out.println(value + " pushed into stack");
        }

        void pop() {
            if (top == null) {
                System.out.println("Stack Underflow!");
                return;
            }

            System.out.println(top.data + " popped from stack");
            top = top.next;
        }


        void display() {
            if (top == null) {
                System.out.println("Stack is empty");
                return;
            }

            Node temp = top;

            System.out.println("Stack elements:");
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    static class Queue {

        // Node class
        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        Node front = null;
        Node rear = null;


        void enqueue(int value) {
            Node newNode = new Node(value);

            if (rear == null) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }

            System.out.println(value + " inserted into queue");
        }


        void dequeue() {
            if (front == null) {
                System.out.println("Queue Underflow!");
                return;
            }

            System.out.println(front.data + " removed from queue");

            front = front.next;

            if (front == null) {
                rear = null;
            }
        }


        void display() {
            if (front == null) {
                System.out.println("Queue is empty");
                return;
            }

            Node temp = front;

            System.out.print("Queue elements: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack stack = new Stack();
        Queue queue = new Queue();

        int choice, value;

        while (true) {

            System.out.println("\n==== MENU ====");
            System.out.println("1. Push Stack");
            System.out.println("2. Pop Stack");
            System.out.println("3. Display Stack");
            System.out.println("4. Enqueue Queue");
            System.out.println("5. Dequeue Queue");
            System.out.println("6. Display Queue");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.display();
                    break;

                case 4:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    queue.enqueue(value);
                    break;

                case 5:
                    queue.dequeue();
                    break;

                case 6:
                    queue.display();
                    break;

                case 7:
                    System.out.println("Program Ended");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
