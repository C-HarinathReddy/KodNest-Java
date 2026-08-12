
import java.util.Scanner;

class Student {

    String name;

    void setName(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("Student Name: " + name);
    }

    void showScore(int first) {
        System.out.println("First Score: " + first);
    }

    void showScore(int first, int second) {
        int r = first + second;
        System.out.println("Two-Score Total: " + r);
    }
}

public class prg8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        Student s = new Student();
        s.setName(name);
        s.showName();
        s.showScore(first);
        s.showScore(first, second);

    }
}
