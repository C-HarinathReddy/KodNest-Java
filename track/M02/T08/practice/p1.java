
import java.util.Scanner;

public class p1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        boolean status = false;

        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                System.out.println("First index: " + i);
                status = true;
                break;
            }
        }
        if (!status) {
            System.out.println("First index: -1");
        }
    }
}
