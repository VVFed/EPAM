import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите A: ");
        double a = in.nextDouble();
        System.out.print("Введите B: ");
        double b = in.nextDouble();
        System.out.print("Введите x: ");
        double x = in.nextDouble();
        System.out.print("Введите y: ");
        double y = in.nextDouble();
        System.out.print("Введите z: ");
        double z = in.nextDouble();
        if (a <= 0 || b <= 0 || x <= 0 || y <= 0 || z <= 0) {
            System.out.println("Ошибка: все величины должны быть > 0");
            return;
        }
        double o1 = Math.min(a, b);
        double o2 = Math.max(a, b);
        double k1;
        double k2;
        if (x >= y && x >= z) {
            k1 = Math.min(y, z);
            k2 = Math.max(y, z);
        } else if (y >= x && y >= z) {
            k1 = Math.min(x, z);
            k2 = Math.max(x, z);
        } else {
            k1 = Math.min(x, y);
            k2 = Math.max(x, y);
        }
        if (o1 > k1 && o2 > k2) {
            System.out.println("Пройдёт");
        } else System.out.println("Не пройдёт");
    }
}