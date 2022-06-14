// 8. Дана последовательность целых чисел A1, A2, ... , An. Образовать новую последовательность, выбросив из исходной
// те члены, которые равны min(А1, А2, ... , Аn)

public class Main {
    public static void main (String[] args) {
        int n = 10;
        int[] a = new int[n];
        a[0] = 1;
        a[1] = 2;
        a[2] = -13;
        a[3] = 3;
        a[4] = 4;
        a[5] = 5;
        a[6] = -13;
        a[7] = 6;
        a[8] = -13;
        a[9] = 7;
        int min = a[0];
        for (int i : a) {
            min = Math.min(i, min);
        }
        int amountRemote = 0;
        for (int j : a) {
            if (j == min) amountRemote++;
        }
        int[] a2 = new int[n - amountRemote];
        int n2 = 0;
        for (int k = 0 ; k < n ; k++) {
            if (a[k] != min) {
                a2[n2] = a[k];
                n2++;
            }
        }
        for (int l : a2) System.out.println(l);
    }
}