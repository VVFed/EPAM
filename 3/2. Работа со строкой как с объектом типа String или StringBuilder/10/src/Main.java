// 10. Найти положительные элементы главной диагонали квадратной матрицы.

public class Main {
    public static void main (String[] args) {
        int n = 5;
        int[][] a = new int[n][n];
        a[0] = new int[] {2,  6,  3,  7,  8};
        a[1] = new int[] {1, -2,  1,  1,  1};
        a[2] = new int[] {1,  1,  5,  1,  1};
        a[3] = new int[] {4,  2,  5,  0,  8};
        a[4] = new int[] {4,  2,  5,  9,  8};
        String positiveElements = "";
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                if (i == j && a[i][j] > 0) {
                    if (positiveElements.length() > 0) positiveElements = positiveElements.concat(", " + a[i][j]);
                    else positiveElements = Integer.toString(a[i][j]);
                }
            }
        }
        if (positiveElements.length() == 0) System.out.println("Положительные элементы на главной диагонали отсутствуют.");
        else System.out.println("Положительные элементы главной диагонали: " + positiveElements);
    }
}