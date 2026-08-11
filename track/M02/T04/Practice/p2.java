
import java.util.Scanner;

class StudentProgress {

    String name;
    int completedLessons;
    int totalLessons;
    int percentage;
}

public class p2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentProgress s = new StudentProgress();
        s.name = scanner.next();
        s.completedLessons = scanner.nextInt();
        s.totalLessons = scanner.nextInt();
        s.percentage = (s.completedLessons * 100) / s.totalLessons;

        System.out.println("Student: " + s.name);
        System.out.println("Progress: " + s.completedLessons + "/" + s.totalLessons);
        System.out.println("Completion: " + s.percentage + "%");
    }
}
