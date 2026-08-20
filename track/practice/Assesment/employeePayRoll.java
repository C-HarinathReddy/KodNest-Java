
import java.util.Scanner;

class Employee {

    // Declare instance variables
    int employeeId;
    String employeeName;
    double basicSalary;
    double bonus;

    // Write the zero-parameter constructor
    Employee() {
        this.employeeId = 0;
        this.employeeName = "";
        this.basicSalary = 0.0;
        this.bonus = 0.0;
    }

    // Write the parameterized constructor
    Employee(int employeeId, String employeeName, double basicSalary, double bonus) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    // Write setEmployeeDetails()
    void setEmployeeDetails(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.bonus = 0.0;
    }

    // Write the overloaded addBonus() methods
    void addBonus(double bonusAmount) {
        this.bonus = bonusAmount;
    }

    void addBonus(double bonusPercentage, double extraReward) {
        double percentageBonus = basicSalary * bonusPercentage / 100;
        double additionalBonus = percentageBonus + extraReward;
        this.bonus = this.bonus + additionalBonus;
    }

    // Write calculateTotalSalary()
    double calculateTotalSalary() {
        double totalSalary = basicSalary + bonus;
        return totalSalary;
    }

    // Write displayEmployee()
    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}

public class employeePayRoll {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first employee details
        int employeeId = scanner.nextInt();
        scanner.nextLine();
        String employeeName = scanner.nextLine();
        double basicSalary = scanner.nextDouble();
        double bonus = scanner.nextDouble();
        Employee e1 = new Employee();
        e1.setEmployeeDetails(employeeId, employeeName, basicSalary);
        e1.addBonus(bonus);

        // Create and update the first Employee object
        // Read the second employee details
        employeeId = scanner.nextInt();
        scanner.nextLine();
        employeeName = scanner.nextLine();
        basicSalary = scanner.nextDouble();
        bonus = scanner.nextDouble();
        double bonusPercentage = scanner.nextDouble();
        double extraReward = scanner.nextDouble();

        // Create and update the second Employee object
        Employee e2 = new Employee(employeeId, employeeName, basicSalary, bonus);
        e2.addBonus(bonusPercentage, extraReward);
        System.out.println("Employee 1");
        e1.displayEmployee();
        System.out.println();
        System.out.println("Employee 2");
        e2.displayEmployee();

        // Display both employees
    }
}
