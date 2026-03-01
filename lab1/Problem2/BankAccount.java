package lab1.Problem2;

public class BankAccount {

    public static double interestRate = 3.5;

    public static final String BANK_NAME = "National Bank";

    private final int accountNumber;
    private final AccountType type;

    private double balance;

    {
        balance = 0;
    }

    public BankAccount(int accountNumber, AccountType type) {
        this.accountNumber = accountNumber;   
        this.type = type;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void deposit(double amount, String currency) {
        System.out.println("Depositing in currency: " + currency);
        balance += amount;
    }
 
    public void transferTo(BankAccount other, double amount) {
        this.balance -= amount;   
        other.balance += amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public AccountType getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }
}
