
import java.util.Scanner;

class SalesAnalyzer {

    // Declare the dailySales array
    double[] dailySales;

    // Write the constructor
    SalesAnalyzer(double[] dailySales) {
        this.dailySales = dailySales;
    }

    // Write calculateTotal()
    double calculateTotal() {
        double total = 0;
        for (int i = 0; i < dailySales.length; i++) {
            total += dailySales[i];
        }
        return total;
    }

    // Write calculateAverage()
    double calculateAverage() {
        return calculateTotal() / dailySales.length;
    }

    // Write findHighestSalesDay()
    int findHighestSalesDay() {
        int max = 0;
        for (int i = 1; i < dailySales.length; i++) {
            if (dailySales[i] > dailySales[max]) {
                max = i;
            }
        }
        return max + 1;
    }

    // Write findLowestSalesDay()
    int findLowestSalesDay() {
        int min = 0;
        for (int i = 1; i < dailySales.length; i++) {
            if (dailySales[i] < dailySales[min]) {
                min = i;
            }
        }
        return min + 1;
    }

    // Write countAboveAverageDays()
    int countAboveAverageDays() {
        double avg = calculateAverage();
        int c = 0;
        for (int i = 0; i < dailySales.length; i++) {
            if (dailySales[i] > avg) {
                c++;
            }
        }
        return c;
    }

    // Write displayReport()
    void displayReport() {
        int high = findHighestSalesDay();
        int low = findLowestSalesDay();
        System.out.println("Number of Days: " + dailySales.length);
        System.out.println("Total Sales: " + calculateTotal());
        System.out.println("Average Sales: " + calculateAverage());
        System.out.println("Highest Sales Day: " + findHighestSalesDay());
        System.out.println("Highest Sales: " + dailySales[high - 1]);
        System.out.println("Lowest Sales Day: " + findLowestSalesDay());
        System.out.println("Lowest Sales: " + dailySales[low - 1]);
        System.out.println("Days Above Average: " + countAboveAverageDays());
    }
}

public class dailySalesAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of days
        int numberOfDays = scanner.nextInt();

        // Create and populate the sales array
        double dailySales[] = new double[numberOfDays];
        for (int i = 0; i < numberOfDays; i++) {
            dailySales[i] = scanner.nextInt();
        }

        // Create the SalesAnalyzer object
        SalesAnalyzer s = new SalesAnalyzer(dailySales);
        s.displayReport();

        // Display the report
    }
}
