
class Employee {

    String empName;
    String empId;
    double empSalary;
    String empMailId;

    Employee(String empId, String empName, String empMailId, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empMailId = empMailId;
        this.empSalary = empSalary;
    }

    String displayEmployeeDetails() {
        return "\nEmployee Id : " + empId
                + "\nEmployee Name: " + empName
                + "\nEmployee Mail Id : " + empMailId
                + "\nEmployee Salary : " + empSalary;
    }
}
