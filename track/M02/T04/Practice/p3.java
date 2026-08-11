
import java.util.Scanner;

class SupportTicket {

    // Declare id, priority and waitingMinutes
    int id;
    int priority;
    int waitingMinutes;
}

public class p3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and fill the first ticket
        SupportTicket s1 = new SupportTicket();
        s1.id = scanner.nextInt();
        s1.priority = scanner.nextInt();
        s1.waitingMinutes = scanner.nextInt();

        // Create and fill the second ticket
        SupportTicket s2 = new SupportTicket();
        s2.id = scanner.nextInt();
        s2.priority = scanner.nextInt();
        s2.waitingMinutes = scanner.nextInt();

        // Create and fill the third ticket
        SupportTicket s3 = new SupportTicket();
        s3.id = scanner.nextInt();
        s3.priority = scanner.nextInt();
        s3.waitingMinutes = scanner.nextInt();

        // Initially select the first ticket
        SupportTicket selected = s1;

        // Compare the second ticket using the ordered rules
        if (s2.priority > s1.priority) {
            selected = s2;
        } else if (s2.priority == s1.priority && s2.waitingMinutes > s1.waitingMinutes) {
            selected = s2;
        } else if (s2.priority == selected.priority && s2.waitingMinutes == selected.waitingMinutes && s2.id < selected.id) {
            selected = s2;
        }

        // Compare the third ticket with the current selection
        if (s3.priority > selected.priority) {
            selected = s3;
        } else if (s3.priority == selected.priority && s3.waitingMinutes > selected.waitingMinutes) {
            selected = s3;
        } else if (s3.priority == selected.priority && s3.waitingMinutes == selected.waitingMinutes && s3.id < selected.id) {
            selected = s3;
        }

        // Print the selected object's fields
        System.out.println("Selected Ticket: " + selected.id);
        System.out.println("Priority: " + selected.priority);
        System.out.println("Waiting Minutes: " + selected.waitingMinutes);
    }
}
