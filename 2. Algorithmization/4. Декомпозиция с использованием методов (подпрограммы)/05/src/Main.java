// 5. Составить программу, которая в массиве A[N] находит второе по величине число.

public class Main {
    public static void main (String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = 0;
        int beforeMax = 0;
        for (int i : a) {
            if (i > max) {
                beforeMax = max;
                max = i;
            }
            else if (i < max && i > beforeMax) beforeMax = i;
        }
        System.out.println("Второе по величине число: " + beforeMax);
    }
}