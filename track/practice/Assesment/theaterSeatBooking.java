
import java.util.Scanner;

class TheatreBooking {

    int[] seats;
    int bookedCount;
    // Declare the seats array and bookedCount

    // Write the constructor
    TheatreBooking(int totalSeats) {
        this.seats = new int[totalSeats];
        this.bookedCount = 0;
    }

    // Write bookSeat()
    String bookSeat(int seatNumber) {
        if (seatNumber < 1 || seatNumber > seats.length) {
            return "Invalid Seat";
        }
        int seatIndex = seatNumber - 1;
        if (seats[seatIndex] == 1) {
            return "Already Booked";
        }

        seats[seatIndex] = 1;
        bookedCount++;
        return "Booked";
    }

    // Write getAvailableCount()
    int getAvailableCount() {
        int availableCount = seats.length - bookedCount;
        return availableCount;
    }

    // Write displaySeatStatus()
    void displaySeatStatus() {
        System.out.println("Seat Status");
        for (int i = 0; i < seats.length; i++) {
            String status;
            if (seats[i] == 1) {
                status = "Booked";
            } else {
                status = "Available";
            }
            System.out.println("Seat " + (i + 1) + ": " + status);
        }
    }
}

public class theaterSeatBooking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read total seats and number of booking requests
        int totalSeats = scanner.nextInt();
        int numberOfBookings = scanner.nextInt();

        // Create the TheatreBooking object
        TheatreBooking t = new TheatreBooking(totalSeats);

        // Process every booking request
        for (int i = 1; i <= numberOfBookings; i++) {
            int seatNumber = scanner.nextInt();
            String res = t.bookSeat(seatNumber);
            System.out.println("Request " + i + " - Seat " + seatNumber + ": " + res);
        }
        t.displaySeatStatus();
        System.out.println("Booked Seats: " + t.bookedCount);
        System.out.println("Available Seats: " + t.getAvailableCount());

        // Display seat status and the summary
    }
}
