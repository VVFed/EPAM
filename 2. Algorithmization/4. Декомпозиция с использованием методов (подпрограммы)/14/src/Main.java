// 14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведённая в
// степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.

public class Main {
    public static void main (String[] args) {
        int k = 10000;
        for (int i = 1 ; i <= k ; i++) {
            if (numberArmstrong(i)) System.out.println(i);
        }
    }
    public static int amountDigits (int a) {
        int amountDigits = 0;
        for (int i = 1 ; a % i < a ; i *= 10){
            amountDigits++;
        }
        return amountDigits;
    }
    public static int sumDigits (int a) {
        int amount = amountDigits(a);
        int sumDigits = 0;
        int pow = amount - 1;
        int number;
        for (int i = 0 ; i < amount ; i++) {
            number = (int) (a / Math.pow(10, pow));
            a -= number * Math.pow(10, pow);
            pow--;
            sumDigits += number;
        }
        return sumDigits;
    }
    public static boolean numberArmstrong (int a) {
        return Math.pow(sumDigits(a), amountDigits(a)) == a;
    }
}