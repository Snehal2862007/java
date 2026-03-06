package ex2;

import java.util.*;

public class NamesSort {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        String[] names=new String[10];

        System.out.println("Enter 10 names:");
        for(int i=0;i<10;i++)
            names[i]=sc.next();

        Arrays.sort(names);

        System.out.println("Sorted Names:");
        for(String name:names)
            System.out.println(name);
        sc.close();
    }
}
