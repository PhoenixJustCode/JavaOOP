// Run: javac lab2/problem3/*.java && java lab2.problem3.BankTest
package lab2.problem3;

public class BankTest {
    public static void main(String[] args) {
        Bank myBank = new Bank();

        SavingsAccount sa = new SavingsAccount(101, 0.05);
        CheckingAccount ca = new CheckingAccount(102);

        myBank.openAccount(sa);
        myBank.openAccount(ca);

        sa.deposit(1000);
        ca.deposit(500);
        ca.withdraw(20);

        System.out.println("Before update:");
        myBank.displayAccounts();

        myBank.update();

        System.out.println("\nAfter update:");
        myBank.displayAccounts();
    }
}
