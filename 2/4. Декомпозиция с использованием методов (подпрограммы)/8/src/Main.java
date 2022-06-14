// 8. Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] + D[5] + D[6]. Составить
// метод (методы) для вычисления суммы трёх последовательно расположенных элементов массива с номерами от k до m.

public class Main {
    public static void main (String[] args) {
        int k = 2;
        int[] d = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(sumThreeElements(k, d));
    }
    public static int sumThreeElements (int i, int[] a) {
        return a[i - 1] + a[i] + a[i + 1];
    }
}