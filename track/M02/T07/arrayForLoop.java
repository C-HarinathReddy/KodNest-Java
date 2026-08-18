
import java.util.Scanner;

public class arrayForLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 Array elements : ");
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        System.out.print("Arrays elements are : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            sum += a[i];
        }
        System.out.println("");
        System.out.println("Sum: " + sum);
    }
}
