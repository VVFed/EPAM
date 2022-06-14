import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        int a = in.nextInt();
        if (a <= 0) {
            System.out.println("Ошибка: число должно быть положительным");
            return;
        }
        int s = 0;
        for (int i = 1; i <= a; i++) {
            s += i;
        }
        System.out.println("Сумма чисел от 1 до " + a + " равна " + s);
    }
}