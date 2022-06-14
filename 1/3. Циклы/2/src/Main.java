import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a = in.nextInt();
        System.out.print("Введите b: ");
        int b = in.nextInt();
        System.out.print("Введите h: ");
        int h = in.nextInt();
        if (a > b || h <= 0) {
            System.out.println("Данные введены некорректно");
            return;
        }
        int y;
        for (int i = a; i <= b; i = i + h) {
            if (i > 2) y = i;
            else y = -i;
            System.out.println("При x = " + i + ": y = " + y);
        }
    }
}