// 2. Даны две последовательности {a1 <= a2 <= ... <= aN} и {b1 <= b2 <= ... <= bM}. Образовать из них новую
// последовательность чисел так, чтобы она тоже была неубывающей. Дополнительный массив не использовать.

import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        int[] a = {2, 4, 6, 9, 11, 12, 14, 18, 22, 36};
        int[] b = {1, 5, 15, 22, 40};
        int n = a.length - 1;
        int m = b.length - 1;
        a = Arrays.copyOf(a, a.length + b.length);
        for (int i = a.length - 1 ; i >= 0 ; i--) {
            if (n < 0 || (m >= 0 && b[m] > a[n]) ) {
                a[i] = b[m];
                m--;
            }
            else {
                a[i] = a[n];
                n--;
            }
        }
        for (int i : a) {
            System.out.print("  " + i);
        }
    }
}