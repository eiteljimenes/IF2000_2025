package Clases;

/**
 * SinpeMobile: performs money transfers between accounts.
 * Uses LogEntry to record all operations.
 */
public class SinpeMobile {
    private final LogEntry logEntry; // Reference to the log system

    public SinpeMobile(LogEntry logEntry) {
        this.logEntry = logEntry;
    }

    /**
     * Transfer money between two accounts in two banks.
     * @param amount the amount to transfer
     * @param fromBank the source bank
     * @param fromAccNumber the source account number
     * @param toBank the destination bank
     * @param toAccNumber the destination account number
     * @return true if transfer successful, false otherwise
     */
    public boolean transfer(double amount, Bank fromBank, String fromAccNumber,
                            Bank toBank, String toAccNumber) {
        if (amount <= 0) {
            System.err.println("Amount must be positive.");
            return false;
        }

        // Get accounts from banks
        Account from = fromBank.getAccount(fromAccNumber).orElse(null);
        Account to = toBank.getAccount(toAccNumber).orElse(null);

        if (from == null) {
            System.err.println("Source account not found in bank: " + fromBank.getName());
            return false;
        }
        if (to == null) {
            System.err.println("Destination account not found in bank: " + toBank.getName());
            return false;
        }

        synchronized (this) { // Thread-safe basic simulation
            if (from.getBalance() < amount) {
                System.err.println("Insufficient funds in source account.");
                return false;
            }

            // Perform the transfer
            from.setBalance(from.getBalance() - amount);
            to.setBalance(to.getBalance() + amount);

            // Record events
            logEntry.record(LogEntry.EventType.WITHDRAW,
                    "Withdraw " + amount + " from " + from.getAccountNumber() +
                            ". New balance: " + from.getBalance());

            logEntry.record(LogEntry.EventType.DEPOSIT,
                    "Deposit " + amount + " to " + to.getAccountNumber() +
                            ". New balance: " + to.getBalance());

            logEntry.record(LogEntry.EventType.TRANSFER,
                    "Transfer " + amount + " from " + from.getAccountNumber() +
                            " to " + to.getAccountNumber());

            return true;
        }
    }
}
