// 13. Два простых числа называются "близнецами", если они отличаются друг от друга на 2 (например, 41 и 43). Найти и
// напечатать все пары "близнецов" из отрезка [n,2n], где n - заданное натуральное число больше 2. Для решения задачи
// использовать декомпозицию.

public class Main {
    public static void main (String[] args) {
        int n = 10; // n > 2
        for (int i = n ; i <= n * 2 - 2 ; i++) {
            if (twins(i)) System.out.println(i + " и " + (i + 2));
        }
    }
    public static boolean primeNumber (int a) {
        boolean primeNumber = true;
        for (int i = 2 ; i < a ; i++) {
            if (a % i == 0) {
                primeNumber = false;
                break;
            }
        }
        return primeNumber;
    }
    public static boolean twins (int a) {
        return primeNumber(a) && primeNumber(a + 2);
    }
}