
class Student {

    int id;
    String name;
    int age;

    void input(int id, String name, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    void display() {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class shadowing {

    public static void main(String[] args) {
        Student s = new Student();
        s.input(1, "Raja", 18);
        s.display();

    }
}
