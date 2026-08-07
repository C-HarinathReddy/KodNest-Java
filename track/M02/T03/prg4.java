
import java.util.Scanner;

public class prg4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum++;
            }
        }
        System.out.println("Even sum: " + evenSum);
        System.out.println("Odd count: " + oddSum);

        scanner.close();
    }
}
