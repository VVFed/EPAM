import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первый угол: ");
        int a = Math.abs(in.nextInt());
        System.out.print("Введите второй угол: ");
        int b = Math.abs(in.nextInt());
        if (a + b >= 180 || a == 0 || b == 0) {
            System.out.println("Не существует");
        } else if (a == 90 || b == 90 || a + b == 90){
            System.out.println("Cуществует, прямоугольный");
        } else {
            System.out.println("Cуществует, не прямоугольный");
        }
    }
}