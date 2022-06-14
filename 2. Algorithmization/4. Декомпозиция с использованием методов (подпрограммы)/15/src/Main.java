// 15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
// (например, 1234, 5789). Для решения задачи использовать декомпозицию.

public class Main {
    public static void main (String[] args) {
        int n = 4;
        for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n) ; i++) {
            if (strictlyIncreasingArray(arrayOfDigits(i))) System.out.print(" " + i);
        }
    }
    public static int amountDigits (int a) {
        int amount = 0;
        for (int i = 1 ; a % i < a ; i *= 10){
            amount++;
        }
        return amount;
    }
    public static int[] arrayOfDigits (int n) {
        int amountDigits = amountDigits(n);
        int[] a = new int[amountDigits];
        int pow = amountDigits - 1;
        for (int i = 0 ; i < amountDigits ; i++) {
            a[i] = (int) (n / Math.pow(10, pow));
            n -= a[i] * Math.pow(10, pow);
            pow--;
        }
        return a;
    }
    public static boolean strictlyIncreasingArray (int[] a) {
        boolean strictlyIncreasingArray = true;
        for (int i = 1 ; i < a.length ; i++) {
            if (a[i] <= a[i - 1]) {
                strictlyIncreasingArray = false;
                break;
            }
        }
        return  strictlyIncreasingArray;
    }
}