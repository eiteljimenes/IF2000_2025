/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author eitel
 * SinpeMobile: performs a simple transfer between accounts registered in Bank objects.
 * Records operations in Bitacora.
 */
class SinpeMobile {
    private final Bitacora bitacora;

    public SinpeMobile(Bitacora bitacora) {
        this.bitacora = bitacora;
    }

    /**
     * Transfer amount from source to destination across banks.
     * Returns true if successful, false otherwise.
     */
    public boolean transfer(double amount, Bank fromBank, String fromAccNumber, Bank toBank, String toAccNumber) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive.");

        var fromOpt = fromBank.getAccount(fromAccNumber);
        var toOpt = toBank.getAccount(toAccNumber);

        if (fromOpt.isEmpty()) {
            System.err.println("Source account not found in bank: " + fromBank.getName());
            return false;
        }
        if (toOpt.isEmpty()) {
            System.err.println("Destination account not found in bank: " + toBank.getName());
            return false;
        }

        Account from = fromOpt.get();
        Account to = toOpt.get();

        synchronized (this) { // basic concurrency-safe region for demo
            if (from.getBalance() < amount) {
                System.err.println("Insufficient funds in source account.");
                return false;
            }

            // perform atomic update using getters/setters (because Account abstract methods
            // in your provided code don't accept amount parameters)
            from.setBalance(from.getBalance() - amount);
            to.setBalance(to.getBalance() + amount);

            // Log both operations and the transfer event
            bitacora.record(EventType.WITHDRAW, String.format("Withdraw %.2f from %s. New balance: %.2f",
                    amount, from.getAccountNumber(), from.getBalance()));

            bitacora.record(EventType.DEPOSIT, String.format("Deposit %.2f to %s. New balance: %.2f",
                    amount, to.getAccountNumber(), to.getBalance()));

            bitacora.record(EventType.TRANSFER, String.format("Transfer %.2f from %s to %s",
                    amount, from.getAccountNumber(), to.getAccountNumber()));

            return true;
        }
    }
}


