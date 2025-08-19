
package domain;



public abstract class account {
 // Atribute   
private String accountNumber;
private double balance;
private Person client;



    public account() {
    }

    public account(String accountNumber, double balance, Person client) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Person getClient() {
        return client;
    }

    public void setClient(Person client) {
        this.client = client;
    }
 
    //Methods for polimorfism
    
public abstract void deposit();
public abstract void xinthdraw();
public abstract double interestcalculation();

    @Override
    public String toString() {
        String result = "\nBank Acount INFORMATION:"
                +"\n-------------------------------"
                +"\nAccount Number: "+this.getAccountNumber()
                +"nBalance:  "+this.getBalance()
                +"\nAccount Owner :  "+this.getClient().toString();
        return result;
               
                       
    }






}
