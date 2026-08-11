
import java.util.Scanner;

class StudentUtility {

    void showReportTitle() {
        System.out.println("Student Performance Report");
    }

    static void displayStudent(int id, String name) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    static double getPassingPercentage() {
        return 60.0;
    }

    static double calculatePercentage(int javaScore, int sqlScore) {
        double avg = (javaScore + sqlScore) / 2.0;
        return avg;
    }
}

public class prg3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentUtility utility = new StudentUtility();

        int id = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();
        int javaScore = scanner.nextInt();
        int sqlScore = scanner.nextInt();

        utility.showReportTitle();
        utility.displayStudent(id, name);
        double a = utility.calculatePercentage(javaScore, sqlScore);
        System.out.println("Percentage: " + a);
        if (a >= utility.getPassingPercentage()) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: NEEDS IMPROVEMENT");
        }
        scanner.close();
    }
}
