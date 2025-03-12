/**
 * @Author: CottonCandy2004
 * @Discription: Factorial.
 */

 package Ex1.problem1;

import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws Exception {
        int n;
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(reader.readLine());
            reader.close();
        } catch (Exception e) {
            System.out.println("Invalid input");
            return;
        }
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
