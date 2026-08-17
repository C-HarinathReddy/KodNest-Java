
import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        // int a = 11;
        // int b = 12;
        // int c = 13;
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }

    }
}
