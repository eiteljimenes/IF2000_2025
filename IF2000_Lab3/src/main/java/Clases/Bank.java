/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

//@author eitel
package Clases;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


class Bank {
    private final String name;
    private final Map<String, Account> accounts = new HashMap<>();

    public Bank(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    /**
     * Add an account to this bank registry.
     * Note: user's Account class does not have a bankName field, so we do not attempt
     * to validate ownership here. We simply register the account under its number.
     */
    public void addAccount(Account account) {
        if (account == null) throw new IllegalArgumentException("Account cannot be null.");
        accounts.put(account.getAccountNumber(), account);
    }

    public Optional<Account> getAccount(String accountNumber) {
        return Optional.ofNullable(accounts.get(accountNumber));
    }

    @Override
    public String toString() {
        return "Bank[" + name + "]";
    }
}
  

