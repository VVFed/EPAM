// 7. Даны две неубывающие последовательности действительных чисел {a1 <= a2 <= ... <= aN} и {b1 <= b2 <= ... <= bM}.
// Требуется указать те места, на которые нужно вставлять элементы последовательности {b1 <= b2 <= ... <= bM} в первую
// последовательность так, чтобы новая последовательность оставалась возрастающей.

public class Main {
    public static void main (String[] args) {
        int[] a = {3, 4, 5, 6, 9, 9, 10, 13, 14, 15};
        int[] b = {2, 3, 4, 7, 9, 13, 14, 16, 18, 20};
        int[] index = new int[b.length];
        for (int m = 0 ; m < b.length ; m++) {
            for (int n = 0 ; n < a.length ; n++) {
                if (b[m] < a[n]) {
                    index[m] = n + 1 + m;
                    break;
                }
                else if (n == a.length - 1) index[m] = n + 2 + m;
            }
        }
        for (int i = 0 ; i < b.length ; i++) {
            System.out.println(b[i] + " - на " + index[i]);
        }
    }
}