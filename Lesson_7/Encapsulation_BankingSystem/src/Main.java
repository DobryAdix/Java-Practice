public class Main {
    public static void main(String[] args) {

        // Exercise 2: Encapsulation in a Banking System

        // Tworzenie konta bankowego
        BankAccount account = new BankAccount("12345678", "Blanka Stajkow");

        // Wpłacanie i wypłacanie pieniądzy
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(400); // Test niewystarczających środków

        // Wyświetlanie końcowego salda
        System.out.println("Final Balance: $" + account.getBalance());

    }
}