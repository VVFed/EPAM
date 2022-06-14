// 9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
// Определить, какой столбец содержит максимальную сумму.

public class Main {
    public static void main (String[] args) {
        int m = 4;
        int n = 5;
        int[][] a = new int[m][n];
        a[0] = new int[] {2, 6, 3, 7, 8};
        a[1] = new int[] {1, 1, 1, 1, 1};
        a[2] = new int[] {1, 1, 1, 1, 1};
        a[3] = new int[] {4, 2, 5, 9, 8};
        int maxCount = 0;
        String maxNumber = "";
        int[] columnSum = new int[n];
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < n ; j++) {
                columnSum[j] += a[i][j];
            }
        }
        for (int k = 0 ; k < n ; k++) {
            System.out.println("Сумма элементов столбца № " + (k + 1) + " равна " + columnSum[k]);
            if (columnSum[k] > maxCount) {
                maxCount = columnSum[k];
                maxNumber = Integer.toString(k + 1);
            }
            else if (columnSum[k] == maxCount) maxNumber = maxNumber.concat(", " + (k + 1));
        }
        System.out.println("Максимальная сумма, равная " + maxCount + ", у столбца № " + maxNumber);
    }
}