
import java.util.Scanner;

public class prg2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (a[i] == target) {
                found = true;
            }
        }
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
        System.out.print("Reverse order: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
