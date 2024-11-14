import java.util.ArrayList;
import java.util.List;

public class ListManipulation {


    // Lista z imionami 5 uczniów
    private List<String> students = new ArrayList<>() {{
        add("Janusz");
        add("Waldemar");
        add("Witold");
        add("Roksana");
        add("Ewa");
    }};


    // Metoda do wyświetlania listy
    public void printList() {
        System.out.println(students);
    }

    // Metoda do usuwania nazwy według jej indeksu z listy
    public void removeNameByIndex(int index) {
        if (index >= 0 && index < students.size()) {
            students.remove(index);
        } else {
            System.out.println("Invalid index");
        }
        printList();
    }

    // Metoda do dodawania dwóch kolejnych nazw i wyświetlania zaktualizowanej listy
    public void addMoreNames() {
        students.add("Grzegorz");
        students.add("Maja");
        printList();
    }

}
