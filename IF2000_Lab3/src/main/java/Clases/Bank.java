package Clases;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Bank: representa un banco que contiene cuentas registradas.
 * Permite agregar cuentas y buscarlas por número de cuenta.
 */
public class Bank {
    private final String name;
    private final Map<String, Account> accounts = new HashMap<>();

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Agrega una cuenta al banco.
     * @param account cuenta a agregar
     */
    public void addAccount(Account account) {
        if (account == null) throw new IllegalArgumentException("Account cannot be null.");
        accounts.put(account.getAccountNumber(), account);
    }

    /**
     * Obtiene una cuenta por su número.
     * @param accountNumber número de la cuenta
     * @return Optional que puede contener la cuenta o estar vacío
     */
    public Optional<Account> getAccount(String accountNumber) {
        return Optional.ofNullable(accounts.get(accountNumber));
    }

    @Override
    public String toString() {
        return "Bank[" + name + "]";
    }
}
