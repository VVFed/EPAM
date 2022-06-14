// 6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются
// простыми числами

public class Main {
    public static void main (String[] args) {
        int n = 10;
        double sum = 0;
        int serialNumber;
        double[] a = new double[n];
        a[0] = -1.111; // № 1
        a[1] = 1;      // № 2
        a[2] = 2;      // № 3
        a[3] = 2.345;  // № 4
        a[4] = 3;      // № 5
        a[5] = 3.456;  // № 6
        a[6] = 4;      // № 7
        a[7] = 4.567;  // № 8
        a[8] = 5.555;  // № 9
        a[9] = 6.666;  // № 10
        for (int i = 0 ; i < n ; i++) {
            serialNumber = i + 1;
            for (int j = 2 ; j <= serialNumber ; j++) {
                if (j == serialNumber) sum += a[i];
                else if (serialNumber % j == 0) break;
            }
        }
        System.out.println("Сумма равна " + sum);
    }
}