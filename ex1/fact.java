import java.util.*;
public class fact{
    public static void main(String[] args) {
        int fact_num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        fact_num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=fact_num;i++){
            fact=fact*i;
        }
        System.out.println("factorial of " +fact_num+" is "+fact);
    sc.close();
    }
    
}