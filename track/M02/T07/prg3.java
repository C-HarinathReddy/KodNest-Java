
public class prg3 {

    public static void main(String[] args) {
        int[] values = {10, 20, 30, 40, 50};
        int bonus = 5;
        for (int i = 0; i <= values.length - 1; i++) {
            values[i] = values[i] + bonus;
        }
        System.out.print("Updated values: ");
        for (int x : values) {
            System.out.print(x + " ");
        }
    }
}
