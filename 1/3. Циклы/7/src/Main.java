import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите m: ");
        int m = in.nextInt();
        System.out.print("Введите n: ");
        int n = in.nextInt();
        if (m <= 0 || n < m) {
            System.out.println("Некорректно заданы m и n");
            return;
        }
        int k = 0;
        for (int i = m; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    if (k == 0) System.out.print("\nДля " + i + ": " + j);
                    else System.out.print(", " + j);
                    k++;
                }
            }
            k = 0;
        }
    }
}