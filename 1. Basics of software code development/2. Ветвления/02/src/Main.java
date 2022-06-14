import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a = in.nextInt();
        System.out.print("Введите b: ");
        int b = in.nextInt();
        System.out.print("Введите c: ");
        int c = in.nextInt();
        System.out.print("Введите d: ");
        int d = in.nextInt();
        System.out.print(Math.max(Math.min(a, b), Math.min(c, d)));
    }
}