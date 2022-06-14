import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = in.nextDouble();
        System.out.print("Введите y: ");
        double y = in.nextDouble();
        boolean a = (x >= -2 && x <= 2 && y >= 0 && y <= 4) || (x >= -4 && x <= 4 && y >= -3 && y <= 0);
        System.out.println(a);
    }
}