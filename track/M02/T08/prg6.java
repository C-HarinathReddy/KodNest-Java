
import java.util.Scanner;

public class prg6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        int co = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] == 0) {
                    co++;
                }
            }
        }
        System.out.println("Available seats: " + co);
    }
}
