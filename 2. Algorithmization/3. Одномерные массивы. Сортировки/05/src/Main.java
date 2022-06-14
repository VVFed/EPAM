// 5. Сортировка вставками. Дана последовательность чисел a1, a2, ..., aN. Требуется переставить числа в порядке
// возрастания. Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска.
// Двоичный поиск оформить в виде отдельной функции.

public class Main {
    public static void main (String[] args) {
        int[] a = {4, 8, 3, 9, 5, 7, 10, 2, 6, 1};
            // определяем индекс последнего элемента, до которого сохраняется возрастание
        int lastOfNormal = 0;
        while (a[lastOfNormal + 1] >= a[lastOfNormal]) {
            lastOfNormal++;
            if (lastOfNormal == a.length - 1) break;
        }
            // сортируем
        int k; // индекс элемента, после которого будем вставлять
        int current;
        for (int i = lastOfNormal + 1 ; i < a.length ; i++) {
            k = binarySearch(a, i);
            current = a[i];
            for (int j = i ; j > k ; j--) {
                if (j == k + 1) a[j] = current;
                else a[j] = a[j - 1];
            }
        }
            // выводим
        for (int i : a) {
            System.out.print("  " + i);
        }
    }
    public static int binarySearch (int[] array, int index) {
        if (index == 1) return -1;
        int key = (index - index % 2) / 2;
        int step = key;
        while (array[index] < array[key] || array[index] > array[key + 1]) {
            step = (step + step % 2) / 2;
            if (array[index] < array[key]) key -= step;
            else key += step;
            if (key == -1) break;
        }
        return key;
    }
}