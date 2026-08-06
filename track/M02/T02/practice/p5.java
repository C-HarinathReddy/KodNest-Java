
class p5 {

    public static void main(String[] args) {
        int practiceDays = 5;
        int sessionsPerDay = 2;
        int revisionDay = 3;
        int finalDaySessionLimit = 1;
        int targetSessions = 7;
        int completedSessions = 0;

        for (int i = 1; i <= practiceDays; i++) {
            if (i == revisionDay) {
                continue;
            }
            for (int j = 1; j <= 2; j++) {
                if (i == practiceDays && j == 2) {
                    break;
                }
                System.out.println("Day " + i + " - " + "Session " + j);
                completedSessions += 1;
            }
        }
        System.out.println("Completed Sessions: " + completedSessions);
        String target = completedSessions >= targetSessions ? "Target Achieved" : "Target Pending";
        System.out.println(target);
    }
}
