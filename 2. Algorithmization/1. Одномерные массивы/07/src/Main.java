// 7. Даны действительные числа A1, A2, ... , An. Найти max(A(1)+A(2n), A(2) + A(2n-1), ... , A(n) + A(n+1))

public class Main {
    public static void main (String[] args) {
        double max;
        int n = 5;
        double[] a = new double[2 * n];
        a[0] = -38.6;
        a[1] = -24.9;
        a[2] = -19.2;
        a[3] = -11.1;
        a[4] = -9;
        a[5] = 999999;
        a[6] = 0.07;
        a[7] = 10.1;
        a[8] = 23.4;
        a[9] = 33.3;
        double[] a2 = new double[n];
        for (int i = 0 ; i < n ; i++) {
            a2[i] = a[i] + a[2 * n - 1 - i];
        }
        max = a2[0];
        for (double j : a2) max = Math.max(j, max);
        System.out.println("Ответ: " + max);
    }
}