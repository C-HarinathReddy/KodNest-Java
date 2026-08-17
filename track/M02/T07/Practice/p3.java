
import java.util.Scanner;

public class p3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();
        int[] planned = new int[days];
        int[] completed = new int[days];
        int count = 0;
        int j = 1;

        for (int i = 0; i < days; i++) {
            planned[i] = scanner.nextInt();
        }

        for (int i = 0; i < days; i++) {
            completed[i] = scanner.nextInt();
        }

        for (int i = 0; i < days; i++) {

            if (completed[i] >= planned[i]) {
                System.out.println("Day " + j + ": Completed");
                count++;
            } else {
                System.out.println("Day " + j + ": Pending");
            }

            j++;
        }

        System.out.println("Completed days: " + count);
        scanner.close();
    }
}
