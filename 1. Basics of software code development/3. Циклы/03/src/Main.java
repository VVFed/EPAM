public class Main {
    public static void main (String[] args) {
        int s = 0;
        for (int i = 1; i <= 100; i++) {
            s += Math.pow(i, 2);
        }
        System.out.println("Сумма квадратов первых 100 чисел равна " + s);
    }
}