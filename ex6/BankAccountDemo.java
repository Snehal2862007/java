package ex6;
import java.util.Scanner;

// Custom Exception for Low Balance
class LowBalanceException extends Exception {
    LowBalanceException(String msg) {
        super(msg);
    }
}

// Custom Exception for Negative Number
class NegativeNumberException extends Exception {
    NegativeNumberException(String msg) {
        super(msg);
    }
}

// BankAccount Class
class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void balanceEnquiry() {
        System.out.println("Current Balance: " + balance);
    }

    void deposit(double amount) throws NegativeNumberException {
        if (amount < 0)
            throw new NegativeNumberException("Cannot deposit negative amount");
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void withdraw(double amount) throws LowBalanceException, NegativeNumberException {
        if (amount < 0)
            throw new NegativeNumberException("Cannot withdraw negative amount");

        if (amount > balance)
            throw new LowBalanceException("Insufficient balance");

        balance -= amount;
        System.out.println("Amount Withdrawn: " + amount);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount(1000);

        try {
            acc.balanceEnquiry();

            System.out.print("Enter amount to deposit: ");
            double d = sc.nextDouble();
            acc.deposit(d);

            System.out.print("Enter amount to withdraw: ");
            double w = sc.nextDouble();
            acc.withdraw(w);

            acc.balanceEnquiry();

        } catch (LowBalanceException | NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}