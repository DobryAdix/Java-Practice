public class Main {
    public static void main(String[] args) {

        double[] grades1 = {85, 90, 88, 92, 87}; // Student 1
        double[] grades2 = {78, 82, 80, 79, 76}; // Student 2
        double[] grades3 = {91, 95, 94, 93, 92}; // Student 3

        Student[] students = {
                new Student("Przemysław", 20, grades1),
                new Student("Bolesław", 22, grades2),
                new Student("Laura", 21, grades3)
        };

        for (Student student : students) {
            student.introduce();
        }

    }
}