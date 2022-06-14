// 12. Даны натуральные числа K и N. Написать метод (методы) формирования массива А, элементами которого являются числа,
// сумма цифр которых равна К и которые не больше N.

public class Main {
    public static void main (String[] args) {
        int k = 7;
        int n = 1000;
        for (int i : ArrayA(k, n)){
            System.out.print(" " + i);
        }
    }
    public static int[] ArrayA (int k, int n) {
        int amountElements = 0;
        for (int i = 1 ; i <= n ; i++){
            if (sumDigits(i) == k) amountElements++;
        }
        int[] a = new int[amountElements];
        int j = 0;
        for (int i = 1 ; i <= n ; i++){
            if (sumDigits(i) == k) {
                a[j] = i;
                j++;
            }
        }
        return a;
    }
    public static int sumDigits (int n) {
        int amountDigits = 0;
        for (int i = 1 ; n % i < n ; i *= 10){
            amountDigits++;
        }
        int sumDigits = 0;
        int pow = amountDigits - 1;
        int number;
        for (int i = 0 ; i < amountDigits ; i++) {
            number = (int) (n / Math.pow(10, pow));
            n -= number * Math.pow(10, pow);
            pow--;
            sumDigits += number;
        }
        return sumDigits;
    }
}