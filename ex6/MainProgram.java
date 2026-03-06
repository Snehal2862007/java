package ex6;

import ex6.ExceptionHandlingdemo.*;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        try {

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = c.divide(a, b);

            System.out.println("Result: " + result);

        } catch (DivisionException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}