
import java.util.Scanner;

public class prg5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        int co = 1;

        for (int i = 0; i < r; i++) {
            int tr = 0;
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
                tr += a[i][j];
            }
            System.out.println("Row " + co + " total: " + tr);
            co++;
        }
    }
}
