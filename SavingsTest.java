
    class BankAccount {

    protected double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    void display() {
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Cannot withdraw! Minimum balance of 100 required.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
}

public class SavingsTest {
    public static void main(String[] args) {

        SavingsAccount acc = new SavingsAccount(1000);

        acc.deposit(500);
        acc.withdraw(1300);
        acc.display();
    }
}
