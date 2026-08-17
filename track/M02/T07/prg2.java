
public class prg2 {

    public static void main(String[] args) {
        int[] original = {14, 18, 22, 26};
        // write thte required variables as given
        int updatedIndex = 1;
        int updateValue = 25;
        int requestedIndex = 4;

        int[] snapshot = new int[original.length];
        // Copy every element into snapshot.
        for (int i = 0; i <= requestedIndex - 1; i++) {
            snapshot[i] = original[i];
        }

        int[] liveView = original;
        // Update through liveView.
        liveView[updatedIndex] = updateValue;

        // Display original, snapshot and the reference comparison.
        System.out.print("Original: ");
        for (int i = 0; i <= requestedIndex - 1; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println();
        System.out.print("Snapshot: ");
        for (int i = 0; i <= requestedIndex - 1; i++) {
            System.out.print(snapshot[i] + " ");
        }
        // Validate requestedIndex before accessing original.
        System.out.println();
        System.out.println("Same object: " + (original == liveView));

        if (requestedIndex >= 0 && requestedIndex < original.length) {
            System.out.println("Requested value: " + original[requestedIndex]);
        } else {
            System.out.println("Requested value: Invalid index");
        }
    }
}
