
import java.util.Scanner;

class ArraySearch {

    void search(int arr[], int key) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element Found at Index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element Not Found");
        }
    }
}

public class FoundArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter 5 Elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Target Key; ");
        int key = sc.nextInt();
        ArraySearch as = new ArraySearch();
        as.search(a, key);
    }
}
