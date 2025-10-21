package Clases;

/**
 * Account: clase abstracta que representa una cuenta bancaria.
 * Sirve de base para CurrentAccount y SavingAccount.
 */
public abstract class Account {

    private String accountNumber;
    private double balance;
    private Person client;

    public Account() {}

    public Account(String accountNumber, double balance, Person client) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
    }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public Person getClient() { return client; }
    public void setClient(Person client) { this.client = client; }

    // Métodos abstractos para polimorfismo
    public abstract void deposit();
    public abstract void xinthdraw();
    public abstract double interestcalculation();

    @Override
    public String toString() {
        return "\nBank Account INFORMATION:" +
                "\n-------------------------------" +
                "\nAccount Number: " + accountNumber +
                "\nBalance: " + balance +
                "\nAccount Owner: " + client.toString();
    }
}
