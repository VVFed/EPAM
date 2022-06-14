// 4. Даны действительные числа A1, A2, ... , An. Поменять местами наибольший и наименьший элементы.

public class Main {
    public static void main (String[] args) {
        double[] a = new double[10];
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
        double max = a[0];
        double min = a[0];
        for (double i : a) {
            max = Math.max(i, max);
            min = Math.min(i, min);
        }
        for (int j = 0 ; j < a.length ; j++) {
            if (a[j] == max) a[j] = min;
            else if (a[j] == min) a[j] = max;
        }
        for (double k : a) System.out.println(k);
    }
}