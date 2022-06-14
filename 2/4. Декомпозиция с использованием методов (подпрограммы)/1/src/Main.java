// 1. Написать метод (методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных
// чисел: НОК(А, В) = А * В / НОД(А, В)

public class Main {
    public static void main (String[] args) {
        int a = 12;
        int b = 32;
        System.out.println("НОД(" + a + ", " + b + ") = " + maxCommonDivisor(a, b) + "\nНОК(" + a + ", " + b + ") = " + minCommonMultiple(a, b));
    }
    public static int maxCommonDivisor (int a, int b) {
        int m = Math.min(a, b);
        while (a % m != 0 || b % m != 0) {
            m--;
        }
        return m;
    }
    public static int minCommonMultiple (int a,int b) {
        return a * b / maxCommonDivisor(a, b);
    }
}