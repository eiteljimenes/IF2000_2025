/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author eitel
 */

public class CurrentAccount extends Account {

    private double interestRate; // e.g., 0.01 for 1% annual
    private double commission;   // fixed commission applied on withdrawals

    public CurrentAccount(String accountNumber, double balance, Person client,
                          double interestRate, double commission) {
        super(accountNumber, balance, client);
        this.interestRate = interestRate;
        this.commission = commission;
    }

    public double getInterestRate() { return interestRate; }
    public double getCommission() { return commission; }

    // Implement abstract no-arg methods from Account, but prefer using the overloads below.
    @Override
    public void deposit() {
        throw new UnsupportedOperationException("Use deposit(double amount) instead.");
    }

    /**
     * Proper deposit with an amount.
     */
    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit amount must be positive.");
        setBalance(getBalance() + amount);
    }

    @Override
    public void xinthdraw() {
        throw new UnsupportedOperationException("Use withdraw(double amount) instead.");
    }

    /**
     * Proper withdraw with amount and commission. Returns true if successful.
     */
    public boolean withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Withdraw amount must be positive.");
        double total = amount + commission;
        if (total > getBalance()) return false;
        setBalance(getBalance() - total);
        return true;
    }

    /**
     * Calculate monthly interest, add to balance and return the interest amount.
     * Formula: interest = balance * interestRate / 12
     */
    @Override
    public double interestcalculation() {
        double interest = getBalance() * interestRate / 12.0;
        setBalance(getBalance() + interest);
        return interest;
    }

    @Override
    public String toString() {
        String base = super.toString();
        String extra = "\nAccount Type: CURRENT ACCOUNT"
                + "\nInterest rate (annual): " + interestRate
                + "\nCommission per withdrawal: " + commission
                + "\n";
        return base + extra;
    }
}

