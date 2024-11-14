public class Book {

    String title;
    String author;
    int yearPublished;

    Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Year published: " + yearPublished);
    }

}
