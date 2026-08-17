
import java.util.Scanner;

class ScoreEditor {

    void correctScore(int[] scores, int correctionIndex, int newScore) {
        if (correctionIndex >= 0 && correctionIndex <= scores.length - 1) {
            scores[correctionIndex] = newScore;
        } else {
            System.out.println("Invalid index");
        }
    }

    void displayScores(int[] scores) {
        System.out.print("Scores: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
    }
}

public class p2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] scores = new int[size];

        for (int index = 0; index < scores.length; index++) {
            scores[index] = scanner.nextInt();
        }

        int correctionIndex = scanner.nextInt();
        int newScore = scanner.nextInt();

        // Create one ScoreEditor object
        ScoreEditor s = new ScoreEditor();
        // Correct the score and display the array
        s.correctScore(scores, correctionIndex, newScore);
        s.displayScores(scores);
    }
}
