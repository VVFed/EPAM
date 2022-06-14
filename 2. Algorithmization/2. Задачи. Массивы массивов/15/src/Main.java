// 15. Найти наибольший элемент матрицы и заменить все нечётные элементы на него.

public class Main {
    public static void main (String[] args) {
        int m = 4;
        int n = 5;
        int[][] a = new int[m][n];
        a[0] = new int[] {0, 1, 2, 3, 4};
        a[1] = new int[] {0, 2, 1, 3, 4};
        a[2] = new int[] {0, 2, 1, 3, 4};
        a[3] = new int[] {0, 1, 2, 3, 4};
        int maxElement = a[0][0];
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < n ; j++) {
                if (a[i][j] > maxElement) maxElement = a[i][j];
            }
        }
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < n ; j++) {
                if (a[i][j] % 2 != 0) a[i][j] = maxElement;
                System.out.print("  " + a[i][j]);
            }
            System.out.println();
        }
    }
}