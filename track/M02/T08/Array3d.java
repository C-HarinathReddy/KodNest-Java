
import java.util.Scanner;

class Array3d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter blocks : ");
        int b = sc.nextInt();
        System.out.println("Enter rows : ");
        int r = sc.nextInt();
        System.out.println("Enter columns : ");
        int c = sc.nextInt();
        int a[][][] = new int[b][r][c];
        System.out.println("Enter Elements : ");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    a[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("Elements are : ");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
