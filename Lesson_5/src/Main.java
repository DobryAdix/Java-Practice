public class Main {
    public static void main(String[] args) {

        System.out.println("Access Modifiers in Java");
        System.out.println();

        // Exercise 1: Bank System
        BankAccount account = new BankAccount("123456", "Ludwik Baum", 450);
        account.deposit(100);
        account.withdraw(500.5);
        account.withdraw(600);

        System.out.println();

        // Exercise 2: School System
        School school = new School();
        Student student1 = new Student("Leon", 85.5);
        Student student2 = new Student("Karolina", 92.0);
        Student student3 = new Student("Rudolf", 78.0);

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        double averageGrade = school.calculateAverageGrade();
        System.out.println("Average grade of all students: " + averageGrade);

    }
}