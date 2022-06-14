import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите R: ");
        double r = in.nextDouble();
        int a = (int) r;
        double b = Double.parseDouble(String.format ("%.0f", (r - a) * 1000));
        double x = b + (double) a / 1000;
        System.out.print(x);
    }
}