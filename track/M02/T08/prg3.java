
import java.util.Scanner;

public class prg3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int freq = 0;
        for (int i = 0; i < size; i++) {
            if (a[i] == target) {
                freq++;
            }
        }
        System.out.println("Frequency of " + target + ": " + freq);
    }
}
