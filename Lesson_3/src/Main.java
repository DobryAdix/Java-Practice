public class Main {
    public static void main(String[] args) {

        System.out.println("\n------------- Control Flow Statements -------------");

        // 1. Sprawdzenie, czy liczba jest dodatnia, ujemna, czy równa zero
        int number = 312;
        if (number > 0){
            System.out.println("Liczba " + number + " jest dodatnia");
        } else if (number < 0) {
            System.out.println("Liczba " + number + " jest ujemna");
        } else {
            System.out.println("Liczba " + number + " jest równa 0");
        }

        // 2. Wypisanie pierwszych 10 liczb ciągu Fibonacciego
        int n = 10, firstNumber = 0, secondNumber = 1, nextNumber;
        for (int i = 1; i <= n; i++){
            System.out.println("Liczba " + i + " = " + firstNumber);
            nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }

        // 3. Pętla wypisująca liczby od 1 do 100
        n = 100;
        for (int i = 1; i <= n; i++) {
            if (i < n) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i); // Ostatnia liczba bez przecinka
            }
        }

    }
}