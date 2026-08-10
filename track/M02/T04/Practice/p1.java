
import java.util.Scanner;

class PracticeProfile {

    String name;
    int points;

}

public class p1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and fill the live profile
        PracticeProfile live = new PracticeProfile();
        live.name = scanner.next();
        live.points = scanner.nextInt();

        // Make alias refer to the live object
        PracticeProfile alias = live;

        // Apply the boost through alias and cap the value at 100
        alias.points += scanner.nextInt();
        if (alias.points > 100) {
            alias.points = 100;
        }
        // Create an independent checkpoint and copy the boosted values
        PracticeProfile checkpoint = new PracticeProfile();
        checkpoint.name = live.name;
        checkpoint.points = live.points;
        int correction = scanner.nextInt();
        live.points -= correction;

        // Apply the correction to live and keep the value at least 0
        if (live.points < 0) {
            live.points = 0;
        }
        System.out.println("Live: " + live.name + " " + live.points);
        System.out.println("Alias: " + alias.name + " " + alias.points);
        System.out.println("Checkpoint: " + checkpoint.name + " " + checkpoint.points);
    }
}
