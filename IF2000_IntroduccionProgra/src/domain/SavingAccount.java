package domain;

/**
 *
 * @author eitel
 */
public class SavingsAccount extends Account {

    // Attributes
    private String initialDate;
    private int months;
    private float interest; // porcentaje (ej. 5 = 5%)

    // Constructor
    public SavingsAccount(String initialDate, int months, float interest) {
        this.initialDate = initialDate;
        this.months = months;
        this.interest = interest;
    }

    public SavingsAccount(String initialDate, int months, float interest, String accountNumber, double balance, Person client) {
        super(accountNumber, balance, client);
        this.initialDate = initialDate;
        this.months = months;
        this.interest = interest;
    }

    // Getters y Setters
    public String getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(String initialDate) {
        this.initialDate = initialDate;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    @Override
    public void deposit(double amount) {
        super.setBalance(this.getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= this.getBalance()) {
            super.setBalance(this.getBalance() - amount);
        } else {
            throw new IllegalArgumentException("Insufficient funds");
        }
    }

    @Override
    public double interestCalculation() {
        double total = this.getMonths() * super.getBalance() * (this.getInterest() / 100.0);
        return super.getBalance() + total;
    }

    @Override
    public String toString() {
        double gainedInterest = this.getMonths() * super.getBalance() * (this.getInterest() / 100.0);
        double finalBalance = this.getBalance() + gainedInterest;

        String result = "\nAccount Type: SAVINGS ACCOUNT"
                + "\n---------------------------------"
                + "\n Initial date of account: " + this.getInitialDate()
                + "\n Months of saving: " + this.getMonths()
                + "\n Interest (%): " + this.getInterest()
                + "\n Gained Interest: " + gainedInterest
                + "\n Balance after interest: " + finalBalance;

        return super.toString() + result;
    }
}//endClass
