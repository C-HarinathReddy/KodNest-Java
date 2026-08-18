
public class prg6 {

    public static void main(String[] args) {
        int[] stock = {4, 12, 2, 9, 5};
        int reorderLevel = 5;
        int count = 0;
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] <= reorderLevel) {
                count += 1;
            }
        }
        System.out.println("Items to reorder: " + count);
    }
}
