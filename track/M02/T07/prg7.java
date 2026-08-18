
public class prg7 {

    public static void main(String[] args) {
        int[] readings = {12, 14, 16, 18};
        int updateIndex = 2;
        int newValue = 25;
        int snapshot[] = new int[readings.length];
        for (int i = 0; i < readings.length; i++) {
            snapshot[i] = readings[i];
        }
        readings[updateIndex] = newValue;
        System.out.print("Snapshot: ");
        for (int i = 0; i < readings.length; i++) {
            System.out.print(snapshot[i] + " ");
        }
        System.out.println();
        System.out.print("Updated: ");
        for (int i = 0; i < readings.length; i++) {
            System.out.print(readings[i] + " ");
        }
    }
}
