
import java.util.Scanner;

class Student {

    String name;
    String courseName;
    int completedTopics;
    int questionsSolved;

    void setDetails(String name, String courseName) {
        this.name = name;
        this.courseName = courseName;
    }

    void setProgress(int completedTopics, int questionsSolved) {
        this.completedTopics = completedTopics;
        this.questionsSolved = questionsSolved;
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Course Name: " + courseName);
    }

    void displayProgress() {
        System.out.println("Completed Topics: " + completedTopics);
        System.out.println("Questions Solved: " + questionsSolved);
    }

    void addTopics(int newTopics) {
        this.completedTopics += newTopics;
        System.out.println("Topics updated Succesfully.");
        System.out.println("Total Topics Completed: " + completedTopics);
    }

    void addQuestions(int newQuestions) {
        this.questionsSolved += newQuestions;
        System.out.println("Questions updated Succesfully.");
        System.out.println("Total Questions Solved: " + questionsSolved);
    }
}

public class studentApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();

        System.out.println("Enter Studetn Name: ");
        s1.name = sc.nextLine();
        System.out.println("Enter Course Name: ");
        s1.courseName = sc.nextLine();
        System.out.println("Enter Completed Topics: ");
        s1.completedTopics = sc.nextInt();
        System.out.println("Enter Questions Solved: ");
        s1.questionsSolved = sc.nextInt();

        int choice;
        do {

            System.out.println("\n================================");
            System.out.println("    STUDENT PRACTICE TRACKER");
            System.out.println("================================");
            System.out.println("1. View Details");
            System.out.println("2. View Progress");
            System.out.println("3. Add Topics");
            System.out.println("4. Add Questions");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    s1.displayDetails();
                    break;
                case 2:
                    s1.displayProgress();
                    break;
                case 3:
                    System.out.println("Enter New Topics Completed: ");
                    int newTopics = sc.nextInt();
                    s1.addTopics(newTopics);
                    break;
                case 4:
                    System.out.println("Enter New Questions Solved: ");
                    int newQuestions = sc.nextInt();
                    s1.addQuestions(newQuestions);
                    break;
                case 5:
                    System.out.println("Thank you for using the Student Practice Tracker!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
        sc.close();
    }
}
