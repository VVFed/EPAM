// 16. Магическим квадратом порядка n называется квадратная матрица размера n x n, составленная из чисел
// 1, 2, 3, ... , n^2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей
// равны между собой. Построить такой квадрат.

public class Main {
    public static void main (String[] args) {
        int n = 8; // n >= 3
        int[][] magicSquare = new int[n][n];

        int m1 = 0; // строка первого элемента (затем следующих)
        int n1 = 0; // столбец первого элемента (затем следующих)
        int mx = 0; // направление движения (строка)
        int nx = 0; // направление движения (столбец)
        int mz = 0; // направление смещения (строка) - только для n % 2 = 1
        int nz = 0; // направление смещения (столбец) - только для n % 2 = 1

            // случайно задаём координаты первого элемента и направление движения (по 8 вариантов магических квадратов для каждого n)
        int rand1 = (int) (Math.random() * 4); // 4 варианта расположения первого элемента
        int rand2 = (int) Math.pow(-1, (int) (Math.random() * 2 + 1)); // для каждого из 4 ещё по 2 варианта направления движения (rand2 = -1 || rand2 = 1)
        if (rand1 == 0) {
            if (n % 2 == 1) {
                m1 = 0;
                n1 = (n - 1) / 2;
                mx = -1;
                nx = rand2;
                mz = 1;
                nz = 0;
            }
            else if (n % 4 == 0) {
                m1 = 0;
                n1 = 0;
                mx = rand2;
                nx = -rand2;
            }
        }
        else if (rand1 == 1) {
            if (n % 2 == 1) {
                m1 = (n - 1) / 2;
                n1 = n - 1;
                mx = rand2;
                nx = 1;
                mz = 0;
                nz = -1;
            }
            else if (n % 4 == 0) {
                m1 = 0;
                n1 = n - 1;
                mx = rand2;
                nx = rand2;
            }
        }
        else if (rand1 == 2) {
            if (n % 2 == 1) {
                m1 = n - 1;
                n1 = (n - 1) / 2;
                mx = 1;
                nx = rand2;
                mz = -1;
                nz = 0;
            }
            else if (n % 4 == 0) {
                m1 = n - 1;
                n1 = n - 1;
                mx = rand2;
                nx = -rand2;
            }
        }
        else if (rand1 == 3) {
            if (n % 2 == 1) {
                m1 = (n - 1) / 2;
                n1 = 0;
                mx = rand2;
                nx = -1;
                mz = 0;
                nz = 1;
            }
            else if (n % 4 == 0) {
                m1 = n - 1;
                n1 = 0;
                mx = rand2;
                nx = rand2;
            }
        }
        magicSquare[m1][n1] = 1; // первый элемент

            // строим магический квадрат (n % 2 = 1)
        if (n % 2 == 1) {
            for (int i = 2 ; i <= n * n ; i++) {
                if (i % n == 1) {
                    m1 += mz;
                    n1 += nz;
                }
                else {
                    m1 += mx;
                    n1 += nx;
                }
                if (m1 < 0) m1 += n;
                if (m1 > n - 1) m1 -= n;
                if (n1 < 0) n1 += n;
                if (n1 > n - 1) n1 -= n;
                magicSquare[m1][n1] = i;
            }
        }

            // строим магический квадрат (n % 4 = 0)
        else if (n % 4 == 0) {
            for (int i = 2 ; i <= n * n ; i++) {
                if (i % (n * 2) == 2) {
                    m1 += mx;
                    n1 += nx;
                }
                else if (i % (n * 2) == 1) {
                    m1 += -mx;
                    n1 += nx;
                }
                else if (i % n == n / 2 + 2 || (n == 4 && i % n == 0)) {
                    mx *= -1;
                    m1 += mx;
                    n1 += nx;
                }
                else if (i % n == n / 2 + 1) {
                    n1 += nx;
                }
                else if (i % n == 2) {
                    nx *= -1;
                    m1 += mx;
                    n1 += nx;
                }
                else if (i % n == 1) {
                    m1 += mx;
                }
                else {
                    m1 += mx;
                    n1 += nx;
                }
                if (m1 < 0) m1 += n;
                if (m1 > n - 1) m1 -= n;
                if (n1 < 0) n1 += n;
                if (n1 > n - 1) n1 -= n;
                magicSquare[m1][n1] = i;
            }
        }

            // выводим магический квадрат на экран
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                if (magicSquare[i][j] < 10) System.out.print("   " + magicSquare[i][j]);
                else if (magicSquare[i][j] < 100) System.out.print("  " + magicSquare[i][j]);
                else System.out.print(" " + magicSquare[i][j]);
            }
            System.out.println();
        }

            // проверка квадрата
        int[] a = new int[n * 2 + 2];
        for (int k = 0 ; k < n * 2 + 2 ; k++) {
            for (int i = 0 ; i < n ; i++) {
                for (int j = 0 ; j < n ; j++) {
                    if (k == i) a[k] += magicSquare[i][j];
                    else if (k - n == j) a[k] += magicSquare[i][j];
                    else if (k == n * 2 && i == j) a[k] += magicSquare [i][j];
                    else if (k == n * 2 + 1 && i + j == n - 1) a[k] += magicSquare [i][j];
                }
            }
            if (a[k] != a[0]) {
                System.out.println("It`s not magic square!");
                break;
            }
        }
    }
}