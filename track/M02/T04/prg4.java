
import java.util.Scanner;

class Student {

    int id;
    String name;
    double attendancePercentage;
}

public class prg4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student s1 = new Student();
        s1.id = scanner.nextInt();
        s1.name = scanner.next();
        s1.attendancePercentage = scanner.nextDouble();

        Student s2 = new Student();
        s2.id = scanner.nextInt();
        s2.name = scanner.next();
        s2.attendancePercentage = scanner.nextDouble();

        Student selectedStudent = new Student();
        selectedStudent.id = scanner.nextInt();
        selectedStudent.attendancePercentage = scanner.nextDouble();

        if (selectedStudent.id == s1.id) {
            selectedStudent.name = s1.name;
            s1.attendancePercentage = selectedStudent.attendancePercentage;
            System.out.println("Selected Student: " + selectedStudent.name);
        } else if (selectedStudent.id == s2.id) {
            selectedStudent.name = s2.name;
            s2.attendancePercentage = selectedStudent.attendancePercentage;
            System.out.println("Selected Student: " + selectedStudent.name);
        } else {
            System.out.println("Student not found.");
        }

        System.out.println(s1.id + " - " + s1.name + " - " + s1.attendancePercentage + "%");
        System.out.println(s2.id + " - " + s2.name + " - " + s2.attendancePercentage + "%");
    }
}
