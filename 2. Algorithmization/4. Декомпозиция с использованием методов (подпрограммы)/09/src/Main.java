// 9. Даны числа X, Y, Z, T - длины сторон четырёхугльника. Написать метод (методы) вычисления его площади, если угол
// между сторонами длиной X и Y - прямой.

public class Main {
    public static void main (String[] args) {
        double x = 3;
        double y = 4;
        double z = 7;
        double t = 4;
        quadrilateralArea(x, y, z, t);
    }
    public static void quadrilateralArea (double x, double y, double z, double t) {
            // Разделим четырёхугольник на 2 треугольника:
                // 1. Прямоугольный треугольник с катетами X и Y.
                // 2. Треугольник со сторонами: Z, T и гиппотенуза прямоугольного треугольника с катетами X и Y.
        double g = Math.sqrt(x * x + y * y); // гиппотенуза прямоугольного треугольника с катетами X и Y
        if (z + t <= g || z + g <= t || t + g <= z) {
            System.out.println("Некорректно заданы стороны");
            return;
        }
        double oneTriangleArea = x * y / 2; // площадь треугольника 1
        double p = (z + t + g) / 2; // полупериметр треугольника 2
        double twoTriangleArea = Math.sqrt(p * (p - z) * (p - t) * (p - g)); // площадь треугольника 2 по формуле Герона
        double s1 = oneTriangleArea + twoTriangleArea; // площадь выпуклого четырёхугольника
        double s2 = Math.abs(oneTriangleArea - twoTriangleArea); // площадь невыпуклого четырёхугольника
        System.out.println("Если четырёхугольник выпуклый, площадь равна " + s1 + "\nЕсли четырёхугольник невыпуклый, площадь равна " + s2);
    }
}