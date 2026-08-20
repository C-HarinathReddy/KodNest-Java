
import java.util.Scanner;

public class EmployeeAplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Employes : ");
        int noOfEmployes = sc.nextInt();
        Employee empArray[] = new Employee[noOfEmployes];
        for (int i = 0; i < noOfEmployes; i++) {
            System.out.println("Enter Details of Employee : " + (i + 1));
            System.out.println("Enter Employee Id : ");
            String empId = sc.next();
            sc.nextLine();
            System.out.println("Enter Employee Name : ");
            String empName = sc.next();
            System.out.println("Enter Employee Mail Id : ");
            String empMailId = sc.next();
            System.out.println("Enter Employee Salary : ");
            double empSalary = sc.nextDouble();

            Employee e = new Employee(empId, empName, empMailId, empSalary);
            empArray[i] = e;
        }
        for (int i = 0; i < noOfEmployes; i++) {
            System.out.println(empArray[i].displayEmployeeDetails());
        }

    }
}
