abstract class Account {
    String customerName;
    String accountNumber;
    String accountType;
    double balance;

    public Account(String customerName, String accountNumber, String accountType, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public abstract void computeInterest();

    public abstract void withdraw(double amount);
}

class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.05;  // 5% annual interest

    public SavingsAccount(String customerName, String accountNumber, double balance) {
        super(customerName, accountNumber, "Savings", balance);
    }

    @Override
    public void computeInterest() {
        balance += balance * INTEREST_RATE;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

class CurrentAccount extends Account {
    private static final double MINIMUM_BALANCE = 1000.0;
    private static final double SERVICE_CHARGE = 100.0;

    public CurrentAccount(String customerName, String accountNumber, double balance) {
        super(customerName, accountNumber, "Current", balance);
    }

    @Override
    public void computeInterest() {
        // No interest for current accounts
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < MINIMUM_BALANCE) {
            System.out.println("Not Having Minimum balance. Service charge of " + SERVICE_CHARGE + " will be imposed.");
            if (balance - amount - SERVICE_CHARGE >= 0) {
                balance -= amount + SERVICE_CHARGE;
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            balance -= amount;
        }
    }
}

public class Bank {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount("Test Name1", "12345", 4000.0);
        System.out.println("\nDeposite 2000 in Test Name1's account.");
        savingsAccount.deposit(2000.0);
        savingsAccount.computeInterest();
        System.out.println("Withdraw 1000 from Test Name1's account.");
        savingsAccount.withdraw(1000.0);
        savingsAccount.displayBalance();

        CurrentAccount currentAccount = new CurrentAccount("Test Name2", "78902", 2000.0);
        System.out.println("\nDeposite 1000 in Test Name2's account.");
        currentAccount.deposit(1000.0);
        System.out.println("After withdrawing 500 from Test Name2's account.");
        currentAccount.withdraw(500.0);
        currentAccount.displayBalance();

        System.out.println("\nwithdraw 3000 from Test Name2's account fail due to insufficient balance.");
        currentAccount.withdraw(3000.0);
    }
}