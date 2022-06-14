// 4. Сформировать кадратную матрицу порядка n по заданному образцу (n - чётное):
//              1    2    3....n
//              n   n-1  n-2...1
//              1    2    3....n
//              n   n-1  n-2...1
//              ................
//              n   n-1  n-2...1

public class Main {
    public static void main (String[] args) {
        int n = 6;
        int[][] a = new int[n][n];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                if (i % 2 == 0) a[i][j] = j + 1;
                else a[i][j] = n - j;
                System.out.print("  " + a[i][j]);
            }
            System.out.println();
        }
    }
}