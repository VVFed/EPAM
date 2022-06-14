// 1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в один
// массив, включив второй массив между k-м и (k + 1)-м элементами первого, при этом не используя дополнительный массив.

import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        int k = 3; // k >= 1
        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] a2 = {11, 22, 33, 44, 55};
        a1 = Arrays.copyOf(a1, a1.length + a2.length);
        for (int i = a1.length - 1 ; i >= k ; i--) {
            if (i >= k + a2.length) a1[i] = a1[i - a2.length];
            else a1[i] = a2[i - k];
        }
        for (int i : a1) {
            System.out.print("  " + i);
        }
    }
}