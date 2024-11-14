public class Student {

    private String name;
    private int age;
    private char grade;
    double averageGrade;
    private double[] subjectGrades;


    public Student(String name, int age, double[] subjectGrades) {
        this.name = name;
        this.age = age;
        this.subjectGrades = subjectGrades;
        this.averageGrade = calculateAverageGrade();
        this.grade = calculateFinalGrade();
    }

    // Metoda do wyświetlania ucznia
    public void introduce() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
        if (grade == 'A') {
            System.out.println("Average grade is " + averageGrade + ": Excellent!");
        } else if (grade == 'B') {
            System.out.println("Average grade is " + averageGrade + ": Good!");
        } else {
            System.out.println("Average grade is " + averageGrade + ": Needs Improvement!");
        }
        System.out.println();
    }

    // Metoda do obliczania średniej ocen przedmiotowych
    private double calculateAverageGrade() {
        double sum = 0;
        for (double grade : subjectGrades) {
            sum += grade;
        }
        return sum / subjectGrades.length;
    }

    // Metoda do ustalania oceny końcowej na podstawie średniej ocen
    private char calculateFinalGrade() {
        if (averageGrade >= 90) {
            return 'A';
        } else if (averageGrade >= 80) {
            return 'B';
        } else {
            return 'C';
        }
    }

}
