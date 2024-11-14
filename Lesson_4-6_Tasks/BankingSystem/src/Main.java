public class Main {
    public static void main(String[] args) {

        // Tworzenie kont bankowych
        BankAccount account1 = new BankAccount("123456", "Konrad", 500.0);
        BankAccount account2 = new BankAccount("789012", "Karol", 50.0);

        // Wykonywanie transakcji
        account1.deposit(200);
        account1.withdraw(100);
        account1.displayBalance();

        System.out.println();

        account2.deposit(30);
        account2.displayBalance();
        account2.withdraw(100);
        account2.displayBalance();
    }
}