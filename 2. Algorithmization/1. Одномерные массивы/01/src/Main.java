// 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному K.

public class Main {
    public static void main (String[] args) {
        int k = 5;
        int sum = 0;
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : a) {
            if (i % k == 0) sum += i;
        }
        System.out.println("Сумма равна " + sum);
    }
}