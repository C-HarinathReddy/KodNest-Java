
import java.util.Scanner;

public class p2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codingScore = scanner.nextInt();
        int attendance = scanner.nextInt();
        int projects = scanner.nextInt();

        boolean status = attendance >= 75 || projects >= 2;
        if (codingScore >= 60 && status) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        scanner.close();
    }
}
