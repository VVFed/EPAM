// 9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел
// несколько, то определить наименьшее из них.

public class Main {
    public static void main (String[] args) {
        int n = 10;
        int[] a = new int[n];
        a[0] = -100;
        a[1] = -200;
        a[2] = 1;
        a[3] = -300;
        a[4] = -1;
        a[5] = -400;
        a[6] = -1;
        a[7] = 1;
        a[8] = -1;
        a[9] = 1;
        int maxAmount = 0; // кол-во наиболее часто встречающегося
        int maxAmountNew;
        int valueMaxAmount = a[0]; // значение наиболее часто встречающегося
        for (int i = 0 ; i < n ; i++) {
            maxAmountNew = 0;
            for (int j = 0 ; j < n ; j++) {
                if (a[i] == a[j]) maxAmountNew++;
            }
            if (maxAmountNew > maxAmount) {
                maxAmount = maxAmountNew;
                valueMaxAmount = a[i];
            }
            else if (maxAmountNew == maxAmount) valueMaxAmount = Math.min(valueMaxAmount, a[i]);
        }
        System.out.println("Число " + valueMaxAmount + " встречается " + maxAmount + " раз(а).");
    }
}