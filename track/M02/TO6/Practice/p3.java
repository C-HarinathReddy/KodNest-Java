
import java.util.Scanner;

class CabBooking {

    String name;
    String carType;
    int distance;
    int fare;

    CabBooking(String name) {
        this.name = name;
        this.carType = "Mini";
        this.distance = 5;
        this.fare = 75;
    }

    CabBooking(String name, String carType, int distance) {
        this.name = name;
        this.carType = carType;
        this.distance = distance;
        this.fare = distance * 15;
    }

    void displayBooking() {
        System.out.println("Passenger: " + name);
        System.out.println("Cab Type: " + carType);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: " + "Rs. " + fare);
    }

}

public class p3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        String name;
        String carType;
        int distance;
        switch (choice) {
            case 1:
                name = sc.next();
                CabBooking c = new CabBooking(name);
                c.displayBooking();
                break;
            case 2:
                name = sc.next();
                carType = sc.next();
                distance = sc.nextInt();
                CabBooking cb = new CabBooking(name, carType, distance);
                cb.displayBooking();
                break;
        }
    }
}
