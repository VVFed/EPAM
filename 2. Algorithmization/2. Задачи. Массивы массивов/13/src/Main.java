// 13. Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main (String[] args) {
        int m = 4;
        int n = 5;
        int[][] a = new int[m][n];
        a[0] = new int[] {2, 6, 3, 7, 8};
        a[1] = new int[] {8, 1, 6, 5, 5};
        a[2] = new int[] {6, 3, 1, 9, 1};
        a[3] = new int[] {4, 2, 5, 9, 8};
        Integer[][] aSort = new Integer[n][m];
        int[][] aUp = new int[m][n];
        int[][] aDown = new int[m][n];
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < n ; j++) {
                aSort[j][i] = a[i][j];
            }
        }
        for (int i = 0 ; i < n ; i++) {
            Arrays.sort(aSort[i]);
        }
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < n ; j++) {
                aUp[i][j] = aSort[j][i];
                System.out.print("  " + aUp[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0 ; i < n ; i++) {
            Arrays.sort(aSort[i], Collections.reverseOrder());
        }
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < n ; j++) {
                aDown[i][j] = aSort[j][i];
                System.out.print("  " + aDown[i][j]);
            }
            System.out.println();
        }
    }
}