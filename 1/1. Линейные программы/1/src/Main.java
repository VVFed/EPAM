import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите a: ");
        double a = in.nextDouble();
        System.out.print("Введите b: ");
        double b = in.nextDouble();
        System.out.print("Введите c: ");
        double c = in.nextDouble();
        double z = ((a - 3) * b / 2) + c;
        System.out.print("При a = " + a + ", b = " + b + ", c = " + c + ": z = " + z);
    }
}