package lab2.problem3;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int a, double rate) {
        super(a);
        this.interestRate = rate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }

    @Override
    public String toString() {
        return super.toString() + " (Savings, Rate: " + (interestRate * 100) + "%)";
    }
}
