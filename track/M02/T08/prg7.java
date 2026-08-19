
import java.util.Scanner;

public class prg7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int products = sc.nextInt();
        int months = sc.nextInt();
        int a[][] = new int[products][months];
        for (int i = 0; i < products; i++) {
            int total = 0;
            for (int j = 0; j < months; j++) {
                a[i][j] = sc.nextInt();
                total += a[i][j];
            }
            System.out.println("Product " + (i + 1) + " total: " + total);
        }
        sc.close();
    }
}
