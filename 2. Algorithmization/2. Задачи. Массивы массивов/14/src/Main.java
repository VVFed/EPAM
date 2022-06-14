// 14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причём в каждом столбце число единиц равно
// номеру столбца.

public class Main {
    public static void main (String[] args) {
        int m = 7;
        int n = 5; // n <= m
        byte[][] a = new byte[m][n];
        int[] amountOne = new int[n];
        for (int i = 0 ; i < n ; i++) {
            amountOne[i] = i + 1;
        }
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < n ; j++) {
                if (amountOne[j] == 0) a[i][j] = 0;
                else if (m - i > amountOne[j]) {
                    a[i][j] = (byte) (Math.random() * 2);
                    if (a[i][j] == 1) amountOne[j]--;
                }
                else a[i][j] = 1;
                System.out.print("  " + a[i][j]);
            }
            System.out.println();
        }
    }
}