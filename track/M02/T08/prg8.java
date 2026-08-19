
import java.util.Scanner;

public class prg8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        int tot = 0;
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
            tot += a[i];
        }
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        int total = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
                total += arr[i][j];
            }
        }
        System.out.println("Array total: " + tot);
        System.out.println("Matrix total: " + total);
        sc.close();
    }
}
