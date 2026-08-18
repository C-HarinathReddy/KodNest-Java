
public class prg5 {

    public static void main(String[] args) {
        int[] marks = {70, 80, 60, 90, 50};
        int sum = 0;
        double avg;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        avg = (double) sum / marks.length;
        System.out.println("Total: " + sum);
        System.out.println("Average: " + avg);
    }
}
