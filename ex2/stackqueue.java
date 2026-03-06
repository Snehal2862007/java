package ex2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stackqueue {
    public static void main(String[] args){

        Stack<Integer> stack=new Stack<>();
        Queue<Integer> queue=new LinkedList<>();

        stack.push(10);
        stack.push(20);
        System.out.println("Stack Pop: "+stack.pop());

        queue.add(5);
        queue.add(15);
        System.out.println("Queue Remove: "+queue.remove());
    }
}
