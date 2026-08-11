
import java.util.Scanner;

class PracticeTask {

    int id;
}

public class prg5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create three different PracticeTask objects and read their IDs
        PracticeTask t1 = new PracticeTask();
        PracticeTask t2 = new PracticeTask();
        PracticeTask t3 = new PracticeTask();

        t1.id = scanner.nextInt();
        t2.id = scanner.nextInt();
        t3.id = scanner.nextInt();

        // Preserve the first ID as a primitive int
        int unreachableld = t1.id;

        // Create relay and perform the five reference assignments in order
        PracticeTask relay = t1;
        t1 = t2;
        t2 = t3;
        relay = t2;
        t3 = t1;

        // Print the final IDs reached by all four references
        System.out.println("First Reference: " + t1.id);
        System.out.println("Second Reference: " + t2.id);
        System.out.println("Third Reference: " + t3.id);
        System.out.println("Relay Reference: " + relay.id);
        System.out.println("Unreachable Object: " + unreachableld);
        // Print the ID of the unreachable object
    }
}
