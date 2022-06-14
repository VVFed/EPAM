// 1. Дана матрица. Вывести на экран все нечётные столбцы, у которых первый элемент больше последнего.

public class Main {
    public static void main (String[] args) {
        int m = 4;
        int n = 5;
        int[][] a = new int[m][n];
        a[0] = new int[] {5, 6, 5, 7, 8};
        a[1] = new int[] {1, 1, 1, 1, 1};
        a[2] = new int[] {1, 1, 1, 1, 1};
        a[3] = new int[] {4, 2, 5, 9, 7};
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < n ; j += 2) {
                if (a[0][j] > a[m-1][j]) System.out.print("  " + a[i][j]);
            }
            System.out.println();
        }
    }
}