package IF2000_Lab3;

// Importamos todas las clases desde cCases
import Clases.*;

public class IF2000_Lab3 {
    public static void main(String[] args) {

        // -------------------------
        // 1. Crear personas y clientes
        // -------------------------
        Person person1 = new Person("Alice", "Smith", "001", "555-1234", 25);
        Person person2 = new Person("Bob", "Johnson", "002", "555-5678", 30);

        Client client1 = new Client("C001", "Alice Smith", "555-1234", "123 Main St");
        Client client2 = new Client("C002", "Bob Johnson", "555-5678", "456 Elm St");

        System.out.println("=== Persons and Clients ===");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(client1);
        System.out.println(client2);

        // -------------------------
        // 2. Crear cuentas
        // -------------------------
        CurrentAccount currAcc1 = new CurrentAccount("ACC001", 1000.0, person1, 0.01, 5.0);
        CurrentAccount currAcc2 = new CurrentAccount("ACC002", 500.0, person2, 0.01, 3.0);

        SavingAccount saveAcc1 = new SavingAccount("2025-09-01", 12, 5.0f, "SAV001", 1500.0, person1);
        SavingAccount saveAcc2 = new SavingAccount("2025-09-01", 6, 4.0f, "SAV002", 2000.0, person2);

        System.out.println("\n=== Accounts ===");
        System.out.println(currAcc1);
        System.out.println(currAcc2);
        System.out.println(saveAcc1);
        System.out.println(saveAcc2);

        // -------------------------
        // 3. Crear bancos y agregar cuentas
        // -------------------------
        Bank bank1 = new Bank("Bank A");
        Bank bank2 = new Bank("Bank B");

        bank1.addAccount(currAcc1);
        bank1.addAccount(saveAcc1);

        bank2.addAccount(currAcc2);
        bank2.addAccount(saveAcc2);

        System.out.println("\n=== Banks ===");
        System.out.println(bank1);
        System.out.println(bank2);

        // -------------------------
        // 4. Crear LogEntry y SinpeMobile
        // -------------------------
        LogEntry log = new LogEntry();
        SinpeMobile sinpe = new SinpeMobile(log);

        // -------------------------
        // 5. Realizar transferencias
        // -------------------------
        System.out.println("\n=== Performing Transfers ===");
        boolean success1 = sinpe.transfer(200.0, bank1, "ACC001", bank2, "ACC002");
        boolean success2 = sinpe.transfer(300.0, bank2, "SAV002", bank1, "SAV001");

        System.out.println("\nTransfer 1 success: " + success1);
        System.out.println("Transfer 2 success: " + success2);

        // -------------------------
        // 6. Imprimir todas las entradas del log
        // -------------------------
        System.out.println("\n=== Log Entries ===");
        log.printAll();

        // -------------------------
        // 7. Mostrar balances finales
        // -------------------------
        System.out.println("\n=== Final Account Balances ===");
        System.out.println(currAcc1);
        System.out.println(currAcc2);
        System.out.println(saveAcc1);
        System.out.println(saveAcc2);
    }
}
