package Clases;

/**
 * CurrentAccount: cuenta corriente con interés y comisión.
 */
public class CurrentAccount extends Account {

    private double interestRate; // e.g., 0.01 for 1%
    private double commission;   // fixed commission on withdrawals

    public CurrentAccount(String accountNumber, double balance, Person client,
                          double interestRate, double commission) {
        super(accountNumber, balance, client);
        this.interestRate = interestRate;
        this.commission = commission;
    }

    public double getInterestRate() { return interestRate; }
    public double getCommission() { return commission; }

    @Override
    public void deposit() {
        throw new UnsupportedOperationException("Use deposit(double amount) instead.");
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit amount must be positive.");
        setBalance(getBalance() + amount);
    }

    @Override
    public void xinthdraw() {
        throw new UnsupportedOperationException("Use withdraw(double amount) instead.");
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Withdraw amount must be positive.");
        double total = amount + commission;
        if (total > getBalance()) return false;
        setBalance(getBalance() - total);
        return true;
    }

    @Override
    public double interestcalculation() {
        double interest = getBalance() * interestRate / 12.0;
        setBalance(getBalance() + interest);
        return interest;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAccount Type: CURRENT ACCOUNT" +
                "\nInterest rate (annual): " + interestRate +
                "\nCommission per withdrawal: " + commission;
    }
}
