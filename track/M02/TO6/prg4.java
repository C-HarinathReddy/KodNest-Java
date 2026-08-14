
import java.util.Scanner;

class Book {

    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class prg4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book b = new Book(scanner.nextLine(), scanner.nextLine());
        b.display();
    }
}
