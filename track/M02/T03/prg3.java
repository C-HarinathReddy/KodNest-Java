
import java.util.Scanner;

public class prg3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double monthlyIncome = scanner.nextDouble();
        double rent = scanner.nextDouble();
        double food = scanner.nextDouble();
        double travel = scanner.nextDouble();
        double total = rent + food + travel;
        double remain = monthlyIncome - total;
        String status;
        if (remain >= 0) {
            status = "Within budget";
        } else {
            status = "Over budget";
        }
        System.out.println("Total expense: " + total);
        System.out.println("Remaining: " + remain);
        System.out.println("Status: " + status);

        scanner.close();
    }
}
