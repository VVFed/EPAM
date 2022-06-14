// 17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких действий
// нужно произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

public class Main {
    public static void main (String[] args) {
        int a = 100;
        int amount = 0;
        while (a != 0) {
            a -= sumDigits(a);
            amount++;
        }
        System.out.println("Количество действий: " + amount);
    }
    public static int amountDigits (int a) {
        int amount = 0;
        for (int i = 1 ; a % i < a ; i *= 10){
            amount++;
        }
        return amount;
    }
    public static int sumDigits (int n) {
        int amountDigits = amountDigits(n);
        int sumDigits = 0;
        int pow = amountDigits - 1;
        int number;
        for (int i = 0 ; i < amountDigits ; i++) {
            number = (int) (n / Math.pow(10, pow));
            n -= number * Math.pow(10, pow);
            pow--;
            sumDigits += number;
        }
        return sumDigits;
    }
}