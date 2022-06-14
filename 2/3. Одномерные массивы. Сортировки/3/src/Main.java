// 3. Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... <= aN. Требуется переставить элементы так, чтобы
// они были расположены по убыванию. Написать алгоритм сортировки выбором.

public class Main {
    public static void main (String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 7, 8, 9};
        int maxCount;
        int maxIndex;
        for (int i = 0 ; i < a.length - 1 ; i++) {
            maxCount = a[i];
            maxIndex = i;
            for (int j = i + 1 ; j < a.length ; j++) {
                if (a[j] > maxCount) {
                    maxCount = a[j];
                    maxIndex = j;
                }
            }
            a[maxIndex] = a[i];
            a[i] = maxCount;
        }
        for (int i : a) {
            System.out.print("  " + i);
        }
    }
}