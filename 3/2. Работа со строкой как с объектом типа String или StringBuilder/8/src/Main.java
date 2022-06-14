// 8. В числовой матрице поменять местами два любых слолбца. Номера столбцов вводит пользовательс клавиатуры.

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int m = 4;
        int n = 5;
        int[][] a = new int[m][n];
        a[0] = new int[] {1, 2, 3, 4, 5};
        a[1] = new int[] {0, 0, 0, 0, 0};
        a[2] = new int[] {0, 0, 0, 0, 0};
        a[3] = new int[] {1, 2, 3, 4, 5};
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первый заменяемый столбец (от 1 до " + n + "): ");
        int one = in.nextInt() - 1;
        System.out.print("Введите второй заменяемый столбец (от 1 до " + n + "): ");
        int two = in.nextInt() - 1;
        if (one >= n || one < 0 || two >= n || two < 0) {
            System.out.println("Ошибка: введён несуществующий столбец");
            return;
        }
        int x;
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < n ; j++) {
                if (j == Math.min(one, two)) {
                    x = a[i][one];
                    a[i][one] = a[i][two];
                    a[i][two] = x;
                }
                System.out.print("  " + a[i][j]);
            }
            System.out.println();
        }
    }
}