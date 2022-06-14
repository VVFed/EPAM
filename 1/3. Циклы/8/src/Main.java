import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a = Math.abs(in.nextInt());
        System.out.print("Введите b: ");
        int b = Math.abs(in.nextInt());
        String A = Integer.toString(a);
        String B = Integer.toString(b);
        ArrayList<String> numAB = new ArrayList<>();
        for (int i = 0 ; i < A.length() ; i++) {
            for (int j = 0 ; j < B.length() ; j++) {
                if (A.charAt(i) == B.charAt(j) && !numAB.contains(Character.toString(B.charAt(j)))) {
                    numAB.add(String.valueOf(B.charAt(j)));
                }
            }
        }
        Collections.sort(numAB);
        if (numAB.size() == 0) System.out.print("Общие цифры отсутствуют");
        else {
            System.out.print("Общие цифры: " + numAB.get(0));
            for (int k = 1 ; k < numAB.size() ; k++) {
                System.out.print(", " + numAB.get(k));
            }
        }
    }
}