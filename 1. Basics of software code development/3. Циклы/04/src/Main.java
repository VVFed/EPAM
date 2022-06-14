import java.math.BigInteger;

public class Main {
    public static void main (String[] args) {
        BigInteger p = BigInteger.valueOf(1);
        for (int i = 2; i <= 200; i++) {
            p = p.multiply(BigInteger.valueOf((long) Math.pow(i, 2)));
        }
        System.out.println("Произведение квадратов первых 200 чисел равно " + p);
    }
}