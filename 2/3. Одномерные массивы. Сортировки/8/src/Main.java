// 8. Даны дроби p1/q1, p2/q2, ... , pN/qN (p, q - натуральные). Составить программу, которая приводит эти дроби к
// общему знаменателю и упорядочивает их в порядке возрастания.

public class Main {
    public static void main (String[] args) {
        int[] p = {6, 3, 5, 7, 3};
        int[] q = {5, 2, 3, 9, 4};
            //находим общий знаменатель
        int qGeneral = 1;
        for (int i : q) {
            if (qGeneral % i != 0) {
                if (i % (qGeneral % i) == 0) qGeneral *= i / (qGeneral % i);
                else qGeneral *= i;
            }
        }
            //приводим числители в соответствие с общим знаменателем
        for (int i = 0 ; i < p.length ; i++) {
            p[i] *= qGeneral / q[i];
        }
            //сортируем числители по возрастанию
        int j = 0;
        int x;
        boolean end = false;
        while (!end) {
            if (p[j] <= p[j + 1]) j++;
            else {
                x = p[j];
                p[j] = p[j + 1];
                p[j + 1] = x;
                if (j >= 1) j--;
            }
            if (j == p.length - 1) end = true;
        }
            //выводим результат
        for (int i : p) {
            System.out.println(i + "/" + qGeneral);
        }
    }
}