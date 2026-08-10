
import java.util.Scanner;

class Student {

    int id;
    String name;
    int javaScore;
}

public class prg2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student s1 = new Student();
        s1.id = scanner.nextInt();
        scanner.nextLine();
        s1.name = scanner.nextLine();
        s1.javaScore = scanner.nextInt();

        Student s2 = new Student();
        s2.id = scanner.nextInt();
        scanner.nextLine();
        s2.name = scanner.nextLine();
        s2.javaScore = scanner.nextInt();

        System.out.println(s1.id + " - " + s1.name + " - " + s1.javaScore);
        System.out.println(s2.id + " - " + s2.name + " - " + s2.javaScore);
        if (s1.javaScore > s2.javaScore) {
            System.out.println(s1.name + " has the higher Java score.");
        } else if (s1.javaScore == s2.javaScore) {
            System.out.println("Both students have the same Java score.");
        } else {
            System.out.println(s2.name + " has the higher Java score.");
        }
    }
}
