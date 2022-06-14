// 4. На плоскости заданы своими координатами n точек. Написать метод (методы), определяющие, между какими из пар точек
// самое большое расстояние. Координаты точек занести в массив.

public class Main {
    public static void main (String[] args) {
        int[] x = {-4, 5, 13, 0, -1};
        int[] y = {18, 1, -8, 7, -6};
        searchMaxDistance(x, y);
    }
    public static void searchMaxDistance(int[] x, int[] y) {
        double maxDistance = 0;
        double distance;
        int a = 0;
        int b = 0;
        for (int i = 0 ; i < x.length ; i++) {
            for (int j = 0 ; j < x.length ; j++) {
                distance = Math.sqrt(Math.pow((x[i] - x[j]), 2) + Math.pow((y[i] - y[j]), 2));
                if (distance > maxDistance) {
                    maxDistance = distance;
                    a = i;
                    b = j;
                }
            }
        }
        System.out.println("Наибольшее расстояние (" + maxDistance + ") между точками (" + x[a] + ", " + y[a] + ") и (" + x[b] + ", " + y[b] + ").");
    }
}