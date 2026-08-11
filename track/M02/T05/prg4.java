
import java.util.Scanner;

class Student {

    String name;

    void setName(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Student Name: " + name);
    }
}

public class prg4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the name
        String name = scanner.nextLine();
        // Create one Student object
        Student s1 = new Student();

        s1.setName(name);
        s1.displayName();

    }
}
