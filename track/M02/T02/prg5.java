
public class prg5 {

    public static void main(String[] args) {
        int marks = 68;
        int attendance = 80;
        int practiceDays = 3;

        boolean eligible = (marks >= 60 && attendance >= 75);
        String status = eligible ? "Placement Ready" : "Continue Preparation";
        System.out.println(status);
        for (int i = 1; i <= practiceDays; i++) {
            System.out.println("Practice Day: " + i);
        }
    }
}
