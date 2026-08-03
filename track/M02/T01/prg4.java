
public class prg4 {

    public static void main(String[] args) {
        int completedtopics = 17;
        int totaltopics = 20;
        int dailylearnhours = 3;
        int learndays = 5;
        int remain = totaltopics - completedtopics;
        int weeklylearn = dailylearnhours * learndays;
        double progresspercentage = completedtopics * 100.0 / totaltopics;
        System.out.println("Completed Topics: " + completedtopics);
        System.out.println("Remaining Topics: " + remain);
        System.out.println("Weekly Learning Hours: " + weeklylearn);
        System.out.println("Progress Percentage: " + progresspercentage);
    }
}
