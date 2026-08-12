
import java.util.Scanner;

class OrderCalculator {

    int calculateSubtotal(int price, int quantity) {
        return price * quantity;
    }

    int calculateFinalTotal(int subtotal, int deliveryCharge) {
        return subtotal + deliveryCharge;
    }
}

public class p1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int price = scanner.nextInt();
        int quantity = scanner.nextInt();
        int deliveryCharge = scanner.nextInt();

        OrderCalculator oc = new OrderCalculator();
        int r1 = oc.calculateSubtotal(price, quantity);
        int r2 = oc.calculateFinalTotal(r1, deliveryCharge);

        System.out.println("Subtotal: " + r1);
        System.out.println("Final Total: " + r2);
    }
}
