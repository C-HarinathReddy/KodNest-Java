
import java.util.Scanner;

class Freq {

    void count(int arr[], int key) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                c++;
            }
        }
        System.out.println(key + " : " + c);
    }
}

public class FreqArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Elements");
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Target Count : ");
        int key = sc.nextInt();
        Freq f = new Freq();
        f.count(a, key);

    }
}
