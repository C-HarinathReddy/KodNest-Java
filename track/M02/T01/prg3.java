
public class prg3 {

    public static void main(String[] args) {
        double principal = 10000.0;
        double rate = 6.5;
        double time = 2.0;
        double weight = 72.0;
        double height = 1.8;
        int s1 = 78, s2 = 84, s3 = 69, s4 = 91, s5 = 88;

        int totalmarks = s1 + s2 + s3 + s4 + s5;
        double simpleInterset = principal * rate * time / 100.0;
        double totalAmount = principal + simpleInterset;
        double bmi = weight / (height * height);
        double percentage = totalmarks * 100 / 500;
        System.out.println("Simple Interest: " + simpleInterset);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("BMI: " + bmi);
        System.out.println("Total Marks: " + totalmarks);
        System.out.println("Percentage: " + percentage);
    }
}
