class Stack {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    // Push Operation
    void push(int value) {
        Node newNode = new Node(value);

        newNode.next = top;  // pointer/reference
        top = newNode;

        System.out.println(value + " pushed into stack");
    }

    // Pop Operation
    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow!");
            return;
        }

        System.out.println(top.data + " popped from stack");
        top = top.next;
    }

    // Display Stack
    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        Node temp = top;

        System.out.println("Stack elements:");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next; // move pointer
        }
    }
}
