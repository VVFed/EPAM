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
        double x = (b + Math.sqrt(Math.pow(b,2) + 4 * a * c))/(2 * a) - Math.pow(a,3) * c + Math.pow(b,-2);
        System.out.print("Ответ: " + x);
    }
}