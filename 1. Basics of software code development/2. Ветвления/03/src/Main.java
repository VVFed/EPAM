import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x1: ");
        double x1 = in.nextDouble();
        System.out.print("Введите y1: ");
        double y1 = in.nextDouble();
        System.out.print("Введите x2: ");
        double x2 = in.nextDouble();
        System.out.print("Введите y2: ");
        double y2 = in.nextDouble();
        System.out.print("Введите x3: ");
        double x3 = in.nextDouble();
        System.out.print("Введите y3: ");
        double y3 = in.nextDouble();
            if (Math.abs((x1 - x2) / (x1 - x3)) == Math.abs((y1 - y2) / (y1 - y3))) {
            System.out.println("На одной прямой");
        } else System.out.println("Не на одной прямой");
    }
}