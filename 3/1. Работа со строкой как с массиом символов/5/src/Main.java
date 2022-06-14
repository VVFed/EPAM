// 5. Даны целые числа A1, A2, ... , An. Вывести на экран только те числа, для которых Ai > i.

public class Main {
    public static void main (String[] args) {
        int[] a = new int[10];
        a[0] = -3;
        a[1] = 16;
        a[2] = -11;
        a[3] = 3;
        a[4] = 8;
        a[5] = 0;
        a[6] = 5;
        a[7] = 14;
        a[8] = 7;
        a[9] = 9;
        for (int i = 0 ; i < a.length ; i++) {
            if (a[i] > i) System.out.print("  " + a[i]);
        }
    }
}