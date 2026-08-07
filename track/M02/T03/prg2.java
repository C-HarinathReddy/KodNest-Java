
import java.util.Scanner;

public class prg2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();
        int total = 0;
        String status;
        for (int i = 1; i <= days; i++) {
            int eachDaySolved = scanner.nextInt();
            total += eachDaySolved;
        }

        if (total >= 20) {
            status = "Strong progress";
        } else if (total >= 10 && total <= 19) {
            status = "Keep improving";
        } else {
            status = "Needs more practice";
        }
        System.out.println("Total solved: " + total);
        System.out.println("Status: " + status);

        scanner.close();
    }
}
