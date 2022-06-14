// 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main (String[] args) {
        int m = 4;
        int n = 5;
        Integer[][] a = new Integer[m][n];
        a[0] = new Integer[] {2, 6, 3, 7, 8};
        a[1] = new Integer[] {8, 1, 2, 5, 5};
        a[2] = new Integer[] {6, 3, 0, 9, 1};
        a[3] = new Integer[] {4, 2, 5, 9, 8};
        for (int i = 0 ; i < m ; i++) {
            Arrays.sort(a[i]);
        }
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < n ; j++) {
                System.out.print("  " + a[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0 ; i < m ; i++) {
            Arrays.sort(a[i], Collections.reverseOrder());
        }
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < n ; j++) {
                System.out.print("  " + a[i][j]);
            }
            System.out.println();
        }
    }
}