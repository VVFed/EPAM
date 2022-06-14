// 2. Написать метод (методы) для нахождения наибольшего общего делителя четырёх натуральных чисел.

public class Main {
    public static void main(String[] args) {
        int a = 24;
        int b = 32;
        int c = 40;
        int d = 16;
        System.out.println("НОД(" + a + ", " + b + ", " + c + ", " + d + ") = " + maxCommonDivisor(a, b, c, d));
    }

    public static int maxCommonDivisor(int a, int b, int c, int d) {
        int m = Math.min(Math.min(a, b), Math.min(c, d));
        while (a % m != 0 || b % m != 0 || c % m != 0 || d % m != 0) {
            m--;
        }
        return m;
    }
}