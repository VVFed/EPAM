import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите T: ");
        int t = in.nextInt();
        int h = t / 3600;
        int m = (t - h * 3600) / 60;
        int s = t % 60;
        System.out.printf("%02dч %02dмин %02dс%n", h, m, s);
    }
}