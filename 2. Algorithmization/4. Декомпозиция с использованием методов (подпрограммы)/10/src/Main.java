// 10. Дано натуральное число N. Написать метод (методы) для формирования массива, элементами которого являются цифры
// числа N.

public class Main {
    public static void main (String[] args) {
        int n = 810316;
        for (int i : arrayOfDigits(n)) {
            System.out.print(" " + i);
        }
    }
    public static int[] arrayOfDigits (int n) {
        int amountDigits = 0;
        for (int i = 1 ; n % i < n ; i *= 10){
            amountDigits++;
        }
        int[] a = new int[amountDigits];
        int pow = amountDigits - 1;
        for (int i = 0 ; i < amountDigits ; i++) {
            a[i] = (int) (n / Math.pow(10, pow));
            n -= a[i] * Math.pow(10, pow);
            pow--;
        }
        return a;
    }
}