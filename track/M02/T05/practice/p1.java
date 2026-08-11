
import java.util.Scanner;

class OrderCalculator {

    int calculateSubtotal(int price, int quantity) {
        // Return price multiplied by quantity
        return price * quantity;
    }

    int calculateFinalTotal(int subtotal, int deliveryCharge) {
        // Return subtotal plus delivery charge
        return subtotal + deliveryCharge;
    }
}

public class p1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int price = scanner.nextInt();
        int quantity = scanner.nextInt();
        int deliveryCharge = scanner.nextInt();

        // Create one OrderCalculator object
        OrderCalculator oc = new OrderCalculator();
        // Call both methods
        //int a = oc.calculateSubtotal();
        System.out.println("Subtotal: " + oc.calculateSubtotal(price, quantity));
        System.out.println("Final Total: " + oc.calculateFinalTotal(oc.calculateSubtotal(price, quantity), deliveryCharge));
        // Print the returned values
    }
}
