// 6. Сформировать кадратную матрицу порядка n по заданному образцу (n - чётное):
//              1    1    1....1    1    1
//              0    1    1....1    1    0
//              0    0    1....1    0    0
//              ..........................
//              0    1    1....1    1    0
//              1    1    1....1    1    1

public class Main {
    public static void main (String[] args) {
        int n = 6;
        int[][] a = new int[n][n];
        for (int i = 0 ; i < n; i++) {
            for (int j = 0 ; j < n ; j++) {
                if (i < n / 2 && (i + j > n - 1 || i - j > 0)) a[i][j] = 0;
                else if (i >= n / 2 && (i + j < n - 1 || j - i > 0)) a[i][j] = 0;
                else a[i][j] = 1;
                System.out.print("  " + a[i][j]);
            }
            System.out.println();
        }
    }
}