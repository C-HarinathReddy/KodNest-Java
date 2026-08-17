
import java.util.Scanner;

class MobilePlan {

    String planName;
    int price;

    MobilePlan() {
        this.planName = "Basic";
        this.price = 199;
    }

    MobilePlan(String planName, int price) {
        this.planName = planName;
        this.price = price;
    }

    void display() {
        System.out.println("Plan: " + planName + ", Price: " + price);
    }
}

public class prg6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String planName = scanner.nextLine();
        int price = scanner.nextInt();
        MobilePlan m1 = new MobilePlan();
        MobilePlan m2 = new MobilePlan(planName, price);
        m1.display();
        m2.display();
    }
}
