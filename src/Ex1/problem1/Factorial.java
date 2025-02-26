package Ex1.problem1;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(factorial(n));
    }

    public static BigInteger factorial(int n) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}
