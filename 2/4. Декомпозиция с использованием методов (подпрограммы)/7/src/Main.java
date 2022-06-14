// 7. Написать метод (методы) для вычисления суммы факториалов всех нечётный чисел от 1 до 9.

public class Main {
    public static void main (String[] args) {
        int a = 1;
        int b = 9;
        System.out.println(sumFactorialsOdd(a, b));
    }
    public static int sumFactorialsOdd (int a, int b) {
        int sumFactorialsOdd = 0;
        int factorial;
        if (a % 2 == 0) a++;
        for (int i = a ; i <= b ; i += 2) {
            factorial = 1;
            for (int j = 1 ; j <= i ; j++) {
                factorial *= j;
            }
            sumFactorialsOdd += factorial;
        }
        return sumFactorialsOdd;
    }
}