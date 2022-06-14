import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = in.nextDouble();
        System.out.print("Введите y: ");
        double y = in.nextDouble();
        double a = (Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.print("Ответ: " + a);
    }
}