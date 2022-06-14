// 11. Написать метод (методы), определяющий, в каком из данных двух чисел больше цифр.

public class Main {
    public static void main (String[] args) {
        int a = 316;
        int b = 4112;
        moreDigits (a, b);
    }
    public static void moreDigits (int a, int b) {
        if (amountDigits(a) == amountDigits(b)) System.out.println("Количество цифр равно");
        else System.out.println("Цифр больше в числе "  + Math.max(a, b));
    }
    public static int amountDigits (int a) {
        int amount = 0;
        for (int i = 1 ; a % i < a ; i *= 10){
            amount++;
        }
        return amount;
    }
}