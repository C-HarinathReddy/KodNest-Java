
import java.util.Scanner;

public class p2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        int replace = scanner.nextInt();
        int c = 0;

        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                numbers[i] = replace;
                c++;
            }
        }
        System.out.println("Changes: " + c);
        System.out.print("Updated array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
