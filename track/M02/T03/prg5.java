
import java.util.Scanner;

public class prg5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int days = scanner.nextInt();
        int total = 0;
        for (int i = 1; i <= days; i++) {
            int practice = scanner.nextInt();
            total += practice;
        }
        double avg = total / days;
        System.out.println("Learner: " + name);
        System.out.println("Total solved: " + total);
        System.out.println("Daily average: " + avg);
        if (avg >= 5.0) {
            System.out.println("Status: Consistent");
        } else {
            System.out.println("Status: Needs consistency");
        }
        scanner.close();
    }
}
