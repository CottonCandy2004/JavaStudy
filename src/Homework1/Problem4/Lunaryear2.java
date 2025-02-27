package Homework1.Problem4;

public class Lunaryear2 {
    public static void main(String[] args) {
        int n = 1952;
        while (n < 2050) {
            if (n % 100 == 0 && n % 400 != 0) {
                n += 4;
                continue;
            }
            System.out.print(n + " ");
            n += 4;
        }
    }
}
