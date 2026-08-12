
import java.util.Scanner;

class ResultCalculator {

    int getTotal(int first, int second) {

        return first + second;
    }

    int getTotal(int first, int second, int third) {

        return first + second + third;
    }
}

public class prg7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        ResultCalculator c = new ResultCalculator();
        int r1 = c.getTotal(first, second);
        int r2 = c.getTotal(first, second, third);
        System.out.println("Two-Mark Total: " + r1);
        System.out.println("Three-Mark Total: " + r2);
    }
}
