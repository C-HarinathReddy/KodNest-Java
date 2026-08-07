
import java.util.Scanner;

class scan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter byte value : ");
        byte a = sc.nextByte();
        System.out.println("Byte value is : " + a);

        System.out.print("Enter short value : ");
        short b = sc.nextShort();
        System.out.println("Short value is : " + b);

        System.out.print("Enter int value : ");
        int c = sc.nextInt();
        System.out.println("Int value is : " + c);

        System.out.print("Enter long value : ");
        long d = sc.nextLong();
        System.out.println("Long value is : " + d);

        System.out.print("Enter float value : ");
        float e = sc.nextFloat();
        System.out.println("Float value is : " + e);

        System.out.print("Enter double value : ");
        double f = sc.nextDouble();
        System.out.println("Double value is : " + f);

        System.out.print("Enter boolean value : ");
        boolean g = sc.nextBoolean();
        System.out.println("Boolean value is : " + g);
    }
}
