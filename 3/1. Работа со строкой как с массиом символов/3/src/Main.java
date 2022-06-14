// 3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нём отрицательных, положительных
// и нулевых элементов.

public class Main {
    public static void main (String[] args) {
        int n = 10;
        int amountNeg = 0;
        int amountPos = 0;
        int amountNull = 0;
        double[] a = new double[n];
        a[0] = -38.6;
        a[1] = -24.9;
        a[2] = -19.2;
        a[3] = -11.1;
        a[4] = -5.3;
        a[5] = 0;
        a[6] = 0.07;
        a[7] = 10.1;
        a[8] = 23.4;
        a[9] = 33.3;
        for (double i : a) {
            if (i < 0) amountNeg += 1;
            else if (i > 0) amountPos += 1;
                else amountNull += 1;
        }
        System.out.println("Отрицательных: " + amountNeg + "\nПоложительных: " + amountPos + "\nНулевых: " + amountNull);
    }
}