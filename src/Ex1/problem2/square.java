/**
 * @Author: CottonCandy2004
 * @Discription: Prints a square.
 */

package Ex1.problem2;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        try {
            n = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }
        scanner.close();
        int half = n;
        for (int i = 1; i <= n; i++) {
            printline(half, i);
        }
        for (int i = n - 1; i >= 1; i--) {
            printline(half, i);
        }
    }

    public static void printline(int half, int i) {
        for (int j = 0; j < half - i; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < i; j++) {
            System.out.print("\u002A ");
        }
        System.out.println();
    }
}
