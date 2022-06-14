// 5. Сформировать кадратную матрицу порядка n по заданному образцу (n - чётное):
//              1    1    1....1    1    1
//              2    2    2....2    2    0
//              3    3    3....3    0    0
//              ..........................
//             n-1  n-1   0....0    0    0
//              n    0    0....0    0    0

public class Main {
    public static void main (String[] args) {
        int n = 6;
        int[][] a = new int[n][n];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                if (i + j > n - 1) a[i][j] = 0;
                else a[i][j] = i + 1;
                System.out.print("  " + a[i][j]);
            }
            System.out.println();
        }
    }
}