// 11. Матрицу 10х20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в которых
// число 5 встречается 3 и более раз.

public class Main {
    public static void main (String[] args) {
        int m = 10;
        int n = 20;
        int[][] a = new int[m][n];
        int amountOfFives;
        String lineNumbers = "";
        for (int i = 0 ; i < m ; i++) {
            amountOfFives = 0;
            for (int j = 0 ; j < n ; j++) {
                a[i][j] = (int) (Math.random() * 16);
                if (a[i][j] <= 9) System.out.print(" ");
                System.out.print("  " + a[i][j]);
                if (a[i][j] == 5) amountOfFives++;
            }
            System.out.println();
            if (amountOfFives >= 3 && lineNumbers.length() == 0) lineNumbers = Integer.toString(i + 1);
            else if (amountOfFives >= 3) lineNumbers = lineNumbers.concat(", " + (i + 1));
        }
        System.out.println("\nЧисло 5 встречается 3 и более раз в строках № " + lineNumbers);
    }
}