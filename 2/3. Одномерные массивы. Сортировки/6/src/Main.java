// 6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.

public class Main {
    public static void main (String[] args) {
        int[] a = {3, 7, 2, 9, 5, 1, 4, 10, 8, 6};
        int i = 0;
        int x;
        boolean end = false;
        while (!end) {
            if (a[i] <= a[i + 1]) i++;
            else {
                x = a[i];
                a[i] = a[i + 1];
                a[i + 1] = x;
                if (i >= 1) i--;
            }
            if (i == a.length - 1) end = true;
        }
        for (int j : a) {
            System.out.print("  " + j);
        }
    }
}