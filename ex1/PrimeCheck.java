
public class PrimeCheck {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide a number.");
            return;
        }

        int n = Integer.parseInt(args[0]);
        boolean prime = true;

        if (n <= 1)
            prime = false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime");
    }
}