public class Main {
    public static void main(String[] args) {

        System.out.println("\n------------- Operations on Variables -------------");

        // 1. Obliczenie sumy i iloczynu dwóch liczb
        int firstNumber = 30;
        int secondNumber = 4;
        int sum = firstNumber + secondNumber;
        int multiply = firstNumber * secondNumber;

        /*
        System.out.println("Suma: " + sum);
        System.out.println("Iloczyn: " + multiply);
        */

        // 2. Sprawdzenie, czy liczby są równe
        boolean isEqual = (firstNumber == secondNumber); // false;
        if (isEqual) {
            System.out.println("Liczby " + firstNumber + " i " + secondNumber + " są równe");
        } else {
            System.out.println("Liczby " + firstNumber + " i " + secondNumber + " nie są równe");
        }

        // 3 Sprawdzenie, czy liczba jest parzysta lub nieparzysta
        if (firstNumber % 2 == 0){
            System.out.println("Liczba " + firstNumber + " jest parzysta");
        } else {
            System.out.println("Liczba " + firstNumber + " jest nieparzysta");
        }

    }
}