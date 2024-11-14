public class ArrayManipulation {

    private int[] numbers = {1, 2, 3, 4, 5};

    // Metoda do wyświetlania elementów tablicy
    public void printArray() {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    // Metoda do obliczania i zwracania sumy wszystkich elementów tablicy
    public int sumArray() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // Metoda do modyfikacji drugiego elementu i wyświetlania zaktualizowanej tablicy
    public void modifySecondElement(int newValue) {
        numbers[1] = newValue; // (index 1) - drugi element tablicy
        printArray();
    }

}
