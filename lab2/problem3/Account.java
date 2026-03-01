package lab2.problem3;

public class Account {
    private double balance;
    private int accNumber;

    public Account(int a) {
        balance = 0.0;
        accNumber = a;
    }

    public void deposit(double sum) {
        if (sum > 0) balance += sum;
    }

    public void withdraw(double sum) {
        if (sum > 0 && balance >= sum) balance -= sum;
    }

    public double getBalance() { return balance; }
    public double getAccountNumber() { return accNumber; }

    public void transfer(double amount, Account other) {
        if (amount <= balance) {
            this.withdraw(amount);
            other.deposit(amount);
        }
    }

    @Override
    public String toString() {
        return String.format("Account#%d: Balance=%.2f", accNumber, balance);
    }

    public final void print() {
        System.out.println(toString());
    }
}
