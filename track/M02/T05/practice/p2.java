
import java.util.Scanner;

class DeliveryCalculator {

    int calculateCharge(int distance) {
        return distance * 5;
    }

    int calculateCharge(int distance, int expressFee) {
        return (distance * 5) + expressFee;
    }
}

public class p2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        int expressFee = scanner.nextInt();

        DeliveryCalculator d = new DeliveryCalculator();
        int r1 = d.calculateCharge(distance);
        int r2 = d.calculateCharge(distance, expressFee);

        System.out.println("Standard Charge: " + r1);
        System.out.println("Express Charge: " + r2);
    }
}
