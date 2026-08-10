
class Student {

    int roll;
    String name;
    double height;

    void run() {
        System.out.println("Running");
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}

class StudentApplication {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 21;
        s1.name = "student1";
        s1.height = 5.6;

        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.height);
        s1.run();
        s1.sleep();
    }
}
