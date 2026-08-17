
import java.util.Scanner;

class Employee {

    String name;
    String role;

    Employee(String name) {
        this.name = name;
        this.role = "Trainee";
    }

    void displayProfile() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Role: " + role);
    }
}

public class p1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        Employee e = new Employee(name);
        e.displayProfile();

    }
}
