// 3. Дана матрица. Вывести k-ю строку и р-й столбец матрицы.

public class Main {
    public static void main (String[] args) {
        int m = 5;
        int n = 5;
        int k = 2;
        int p = 3;
        int[][] a = new int[m][n];
        a[0] = new int[] {0, 0, 0, 0, 0};
        a[1] = new int[] {0, 0, 0, 0, 0};
        a[2] = new int[] {0, 0, 0, 0, 0};
        a[3] = new int[] {0, 0, 0, 0, 0};
        a[4] = new int[] {0, 0, 0, 0, 0};
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < m ; j++) {
                if (i == k - 1 || j == p - 1) System.out.print("  " + a[i][j]);
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
}