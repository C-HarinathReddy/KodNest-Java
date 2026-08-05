
import java.util.*;

public class prg3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Learning Day");
                break;
            case 6:
            case 7:
                System.out.println("Revision Day");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}
