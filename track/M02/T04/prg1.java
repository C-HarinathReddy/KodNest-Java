
import java.util.Scanner;

class Student {

    int id;
    String name;
    String course;
    double javaScore;
}

public class prg1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student s1 = new Student();
        s1.id = scanner.nextInt();
        s1.name = scanner.next();
        s1.course = scanner.next();
        s1.javaScore = scanner.nextDouble();

        System.out.println("Student Profile");
        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.name);
        System.out.println("Course: " + s1.course);
        System.out.println("Java Score: " + s1.javaScore);
    }
}
