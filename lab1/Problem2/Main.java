package lab1.Problem2;

public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(1001, AccountType.SAVINGS);
        BankAccount acc2 = new BankAccount(1002, AccountType.CHECKING);

        acc1.deposit(500);
        acc1.deposit(200, "USD");

        acc1.transferTo(acc2, 150);

        BankAccount.interestRate = 4.0;

        System.out.println("Bank: " + BankAccount.BANK_NAME);
        System.out.println("Account 1 balance: " + acc1.getBalance());
        System.out.println("Account 2 balance: " + acc2.getBalance());
    }
}
