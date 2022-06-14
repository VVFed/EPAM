import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите e: ");
        double e = in.nextDouble();
        if (e <= 0) {
            System.out.println("Некорректно задано e");
            return;
        }
        double a = Math.pow(2, -1) + Math.pow(3, -1);
        double s = 0;
        int n = 2;
        while (a >= e) {
            s += a;
            a = Math.pow(2, -n) + Math.pow(3, -n);
            n++;
        }
        System.out.println("Сумма равна " + s);
    }
}