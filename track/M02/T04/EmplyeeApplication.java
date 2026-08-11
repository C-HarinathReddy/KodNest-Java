
class Employee {

    int id;
    String name;

    void work() {
        System.out.println("Working ");
    }
}

class EmplyeeApplication {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 1;
        e1.name = "emp";
        System.out.println(e1.id);
        System.out.println(e1.name);

        Employee e2 = e1;
        e2.id = 2;
        e2.name = "ravi";
        System.out.println(e1.id);
        System.out.println(e1.name);
        e1.work();

        System.out.println(e2.id);
        System.out.println(e2.name);

    }

}
