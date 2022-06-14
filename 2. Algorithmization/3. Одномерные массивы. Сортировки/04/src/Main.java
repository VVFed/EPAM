// 4. Сортировка обменами. Дана последовательность чисел a1, a2, ..., aN. Требуется переставить числа в порядке
// возрастания. Составить алгоритм сортировки, подсчитывая при этом количество перестановок.

public class Main {
    public static void main (String[] args) {
        int[] a = {2, 11, 22, 9, 11, 1, 4, 18, 3, 15};
        int amountChange = 0;
        int x;
        boolean end = false;
        while (!end) {
            end = true;
            for (int i = 0 ; i < a.length - 1 ; i++) {
                if (a[i] > a[i + 1]) {
                    x = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = x;
                    amountChange++;
                    end = false;
                }
            }
        }
        for (int i : a) {
            System.out.print("  " + i);
        }
        System.out.println("\nКоличество перестановок: " + amountChange);
    }
}