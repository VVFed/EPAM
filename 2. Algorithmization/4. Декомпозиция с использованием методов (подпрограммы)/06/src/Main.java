// 6. Написать метод (методы), проверяющий, являются ли данные три числа взаимно простыми.

public class Main {
    public static void main (String[] args) {
        int a = 7;
        int b = 4;
        int c = 12;
        System.out.println(primeThreeNumbers(a, b, c));
    }
    public static boolean primeTwoNumbers (int a, int b) {
        int i = Math.min(a, b);
        while (a % i != 0 || b % i != 0) {
            i--;
        }
        return i == 1;
    }
    public static boolean primeThreeNumbers (int a, int b, int c) {
        return primeTwoNumbers(a, b) && primeTwoNumbers(a, c) && primeTwoNumbers(b, c);
    }
}