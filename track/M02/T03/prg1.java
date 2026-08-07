
import java.util.Scanner;

public class prg1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int solvedProblems = sc.nextInt();
        double percentage = sc.nextDouble();

        System.out.println("Learner: " + name);
        System.out.println("Problems solved: " + solvedProblems);
        System.out.println("Assessment: " + percentage);

        sc.close();
    }
}
