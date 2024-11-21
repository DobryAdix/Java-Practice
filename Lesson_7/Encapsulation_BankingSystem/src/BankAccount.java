public class BankAccount {

    private String accountNumber;     // Numer konta
    private double balance;           // Saldo
    private String accountHolderName; // Imię i nazwisko właściciela konta

    // Konstruktor do ustawienia numeru konta i nazwy właściciela
    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0; // Domyślne saldo to 0
    }

    // Getter dla accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter i setter dla accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Metoda do wpłacania pieniędzy
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Metoda do wypłacania pieniędzy
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // Getter dla salda
    public double getBalance() {
        return balance;
    }

}