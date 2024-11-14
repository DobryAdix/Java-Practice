public class Main {
    public static void main(String[] args) {

        System.out.println("Arrays and Lists in Java");
        System.out.println();

        // Exercise 1: Array Manipulation
        ArrayManipulation arrayManipulation = new ArrayManipulation();

        System.out.println("Array elements:");
        arrayManipulation.printArray();

        System.out.println("Sum of array elements: " + arrayManipulation.sumArray());

        System.out.println("Array after modifying the second element:");
        arrayManipulation.modifySecondElement(10); // Zmienia drugi element na 10

        System.out.println();

        // Exercise 2: List Manipulation
        ListManipulation listManipulation = new ListManipulation();

        System.out.println("Initial list of students:");
        listManipulation.printList();

        System.out.println("List after removing a student by index 2:");
        listManipulation.removeNameByIndex(2); // Usuwa ucznia z indeksu 2

        System.out.println("List after adding two more students:");
        listManipulation.addMoreNames();

    }
}