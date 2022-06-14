// 3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.

public class Main {
    public static void main (String[] args) {
        int a = 5;
        double areaEquilateralHexagon = 6 * areaEquilateralTriangle(a);
        System.out.println("Площадь шестиугольника равна " + areaEquilateralHexagon);
    }
    public static double areaEquilateralTriangle (int a) {
        return a * a * Math.sqrt(3) / 4;
    }
}