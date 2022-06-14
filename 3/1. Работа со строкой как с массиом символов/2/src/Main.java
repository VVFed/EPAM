// 2. Дана последовательность действительных чисел A1, A2, ... , An. Заменить
// все её члены, большие данного Z, этим числом. Подсчитать количество замен.

public class Main {
    public static void main (String[] args) {
        double z = 0.07;
        int amount = 0;
        double[] a = new double[10];
        a[0] = -38.6;
        a[1] = -24.9;
        a[2] = -19.2;
        a[3] = -11.1;
        a[4] = -5.3;
        a[5] = 0;
        a[6] = 0.07;
        a[7] = 10.1;
        a[8] = 23.4;
        a[9] = 33.3;
        for (int i = 0 ; i < a.length ; i++) {
            if (a[i] > z) {
                a[i] = z;
                amount += 1;
            }
        }
        for (double j : a) System.out.println(j);
        System.out.println("Количество замен: " + amount);
    }
}