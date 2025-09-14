package Clases;

public class SavingAccount extends Account {

    private String initialDate;
    private int months;
    private float interest; // porcentaje (ej. 5 = 5%)

    // Constructor simple
    public SavingAccount(String initialDate, int months, float interest) {
        super("", 0, new Person()); // Llamada a Account con valores por defecto
        this.initialDate = initialDate;
        this.months = months;
        this.interest = interest;
    }

    // Constructor completo
    public SavingAccount(String initialDate, int months, float interest, String accountNumber, double balance, Person client) {
        super(accountNumber, balance, client);
        this.initialDate = initialDate;
        this.months = months;
        this.interest = interest;
    }

    // Getters y Setters
    public String getInitialDate() { return initialDate; }
    public void setInitialDate(String initialDate) { this.initialDate = initialDate; }

    public int getMonths() { return months; }
    public void setMonths(int months) { this.months = months; }

    public float getInterest() { return interest; }
    public void setInterest(float interest) { this.interest = interest; }

    @Override
    public void deposit() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void xinthdraw() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double interestcalculation() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 @Override
    public String toString() {
        double gainedInterest = this.getMonths() * this.getBalance() * (this.getInterest() / 100.0);
        double finalBalance = this.getBalance() + gainedInterest;

        String result = "\nAccount Type: SAVING ACCOUNT"
                + "\n---------------------------------"
                + "\nInitial date of account: " + this.getInitialDate()
                + "\nMonths of saving: " + this.getMonths()
                + "\nInterest (%): " + this.getInterest()
                + "\nGained Interest: " + gainedInterest
                + "\nBalance after interest: " + finalBalance;

        return super.toString() + result;
    }
   
}
