// 7. Сформировать квадратную матрицу порядка N по правилу: A[I,J] = sin ((I^2 - J^2) / N)
// и подсчитать количество положительных элементов в ней.

public class Main {
    public static void main (String[] args) {
        int n = 5;
        int positiveCount = 0;
        double[][] a = new double[n][n];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                a[i][j] = Math.sin((i * i - j * j) / n);
                if (a[i][j] < 0) System.out.printf(" " + "%.2f", a[i][j]);
                else System.out.printf("  " + "%.2f", a[i][j]);
                if (a[i][j] > 0) positiveCount++;
            }
            System.out.println("\n");
        }
        System.out.println("Количество положительных: " + positiveCount);
    }
}