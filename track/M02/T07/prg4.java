
import java.util.Scanner;

public class prg4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int total = 0;
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
            total += a[i];
        }
        System.out.println("Total: " + total);
    }
}
