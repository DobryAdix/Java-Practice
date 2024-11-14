import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Student> students;

    public School() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Added student: " + student.getName());
    }

    protected double calculateAverageGrade() {
        double totalGrade = 0.0;
        for (Student student : students) {
            totalGrade += student.getGrade();
        }
        double average = students.size() > 0 ? totalGrade / students.size() : 0.0;
        return Math.round(average * 100.0) / 100.0; // Zaokrągla do dwóch miejsc po przecinku
    }

}
