public class Main {
    public static void main(String[] args) {

        System.out.println("Classes and Objects");

        // 1
        Person person1 = new Person("Kamil", 28);
        Person person2 = new Person("Laura", 25);

        person1.introduce();
        person2.introduce();

        System.out.println();

        // 2
        Book book1 = new Book("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", 1999);
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", 1937);

        book1.displayDetails();
        book2.displayDetails();

        System.out.println();

        // 3
        Car car1 = new Car("Honda", "Civic", 2021);
        Car car2 = new Car("Ford", "Mustang", 2019);

        car1.displayDetails();
        car2.displayDetails();

    }
}