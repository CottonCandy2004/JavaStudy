package Homework1.Problem4;

public class Lunaryear1 {
    public static void main(String[] args) {
        for (int i = 1950; i < 2050; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
