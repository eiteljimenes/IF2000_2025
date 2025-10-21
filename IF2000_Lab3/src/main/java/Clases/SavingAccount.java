package Clases;

/**
 * SavingAccount: cuenta de ahorro con interés fijo.
 */
public class SavingAccount extends Account {

    private String initialDate;
    private int months;
    private float interest;

    public SavingAccount(String initialDate, int months, float interest) {
        super("", 0, new Person());
        this.initialDate = initialDate;
        this.months = months;
        this.interest = interest;
    }

    public SavingAccount(String initialDate, int months, float interest,
                         String accountNumber, double balance, Person client) {
        super(accountNumber, balance, client);
        this.initialDate = initialDate;
        this.months = months;
        this.interest = interest;
    }

    public String getInitialDate() { return initialDate; }
    public void setInitialDate(String initialDate) { this.initialDate = initialDate; }

    public int getMonths() { return months; }
    public void setMonths(int months) { this.months = months; }

    public float getInterest() { return interest; }
    public void setInterest(float interest) { this.interest = interest; }

    @Override
    public void deposit() { throw new UnsupportedOperationException("Use deposit(amount)."); }

    @Override
    public void xinthdraw() { throw new UnsupportedOperationException("Use withdraw(amount)."); }

    @Override
    public double interestcalculation() {
        double gainedInterest = months * getBalance() * (interest / 100.0);
        setBalance(getBalance() + gainedInterest);
        return gainedInterest;
    }

    @Override
    public String toString() {
        double gainedInterest = months * getBalance() * (interest / 100.0);
        double finalBalance = getBalance() + gainedInterest;
        return super.toString() +
                "\nAccount Type: SAVING ACCOUNT" +
                "\nInitial date: " + initialDate +
                "\nMonths: " + months +
                "\nInterest (%): " + interest +
                "\nGained Interest: " + gainedInterest +
                "\nBalance after interest: " + finalBalance;
    }
}
