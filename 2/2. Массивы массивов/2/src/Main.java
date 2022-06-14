// 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Main {
    public static void main (String[] args) {
        int n = 5;
        int[][] a = new int[n][n];
        a[0] = new int[] {0, 0, 0, 0, 0};
        a[1] = new int[] {0, 0, 0, 0, 0};
        a[2] = new int[] {0, 0, 0, 0, 0};
        a[3] = new int[] {0, 0, 0, 0, 0};
        a[4] = new int[] {0, 0, 0, 0, 0};
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                if (i == j || i + j == n - 1) System.out.print("  " + a[i][j]);
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
}