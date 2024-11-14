public class BankAccount {

    private String accountNumber;
    private double balance;
    private String accountHolder;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Metoda do wpłaty środków
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Metoda do wypłaty środków
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        }
    }

    // Metoda do wyświetlania aktualnego salda
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
        if (balance < 100) {
            System.out.println("Warning: Low balance!");
        }
    }

}
