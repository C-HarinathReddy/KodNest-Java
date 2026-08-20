
import java.util.Scanner;

class WaterTank {

    // Declare capacity and currentLevel
    int capacity;
    int currentLevel;

    // Write the constructor
    WaterTank(int capacity, int currentLevel) {
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }

    // Write fillWater()
    int fillWater(int amount) {
        if (amount <= 0) {
            return 0;
        }
        int availableSpace = capacity - currentLevel;
        int addedAmount;
        if (amount > availableSpace) {
            addedAmount = availableSpace;
        } else {
            addedAmount = amount;
        }
        currentLevel += addedAmount;
        return addedAmount;

    }

    // Write drainWater()
    int drainWater(int amount) {
        if (amount <= 0) {
            return 0;
        }
        int removedAmount;
        if (amount > currentLevel) {
            removedAmount = currentLevel;
        } else {
            removedAmount = amount;
        }

        currentLevel -= removedAmount;
        return removedAmount;
    }

    // Write getStatus()
    String getStatus() {
        if (currentLevel == 0) {
            return "Empty";
        }
        if (currentLevel == capacity) {
            return "Full";
        }

        double fillPercentage = currentLevel * 100 / capacity;
        if (fillPercentage <= 25) {
            return " Low";
        } else if (fillPercentage <= 75) {
            return "Medium";
        } else {
            return "High";
        }
    }

    // Write displayTank()
    void displayTank() {
        System.out.println("Capacity: " + capacity);
        System.out.println("Current Level: " + currentLevel);
        int availableSpace = capacity - currentLevel;
        System.out.println("Available Space: " + availableSpace);
        System.out.println("Status: " + getStatus());
    }
}

public class waterTank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read capacity, initial level and operation count
        int capacity = scanner.nextInt();
        int currentLevel = scanner.nextInt();
        int operations = scanner.nextInt();

        // Create the WaterTank object
        WaterTank t = new WaterTank(capacity, currentLevel);

        // Process operations using a loop and switch
        for (int i = 0; i < operations; i++) {
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int fillAmount = scanner.nextInt();
                    int addedamount = t.fillWater(fillAmount);
                    System.out.println("Operation " + (i + 1) + " - Filled: " + addedamount);
                    break;
                case 2:
                    int drainAmount = scanner.nextInt();
                    System.out.println("Operation " + (i + 1) + " - Drained: " + t.drainWater(drainAmount));
                    break;
                case 3:
                    System.out.println("Operation " + (i + 1) + " - Tank Status");
                    t.displayTank();
                    break;
                case 4:
                    System.out.println("Operation " + (i + 1) + " - Invalid Choice");

            }
        }
        // Display the final tank status
        System.out.println("Final Tank Status");
        t.displayTank();
    }
}
