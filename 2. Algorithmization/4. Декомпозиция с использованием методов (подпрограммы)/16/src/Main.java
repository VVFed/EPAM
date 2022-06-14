// 16. Написать программу, определяющую сумму n-значных чисел, содержащих только нечётные цифры. Определить также,
// сколько чётных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

public class Main {
    public static void main (String[] args) {
        int n = 4;
        int sum = 0;
        for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n) ; i++) {
            if (oddElements(arrayOfDigits(i))) sum += i;
        }
        System.out.println("Сумма равна: " + sum + " (чётных цифр: " + evenElementsAmount(arrayOfDigits(sum)) + ")");
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
    public static boolean oddElements (int[] a) {
        boolean oddElements = true;
        for (int i : a) {
            if (i % 2 != 1) {
                oddElements = false;
                break;
            }
        }
        return  oddElements;
    }
    public static int evenElementsAmount (int[] a) {
        int amount = 0;
        for (int i : a) {
            if (i % 2 == 0) amount++;
        }
        return amount;
    }
}