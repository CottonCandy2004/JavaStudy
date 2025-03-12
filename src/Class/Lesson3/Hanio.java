/**
 * @Author: CottonCandy2004
 * @Discription: Hanio.
 */

package Class.Lesson3;

import java.util.Scanner;

public class Hanio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input the number of disks:");
        int n = sc.nextInt();
        System.out.println("The steps to move " + n + " disks:");
        hanio(n, 'A', 'B', 'C');
        sc.close();
    }

    public static void hanio(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.printf("Move disk %d from %c to %c\n", n, a, c);
        } else {
            hanio(n - 1, a, c, b);
            System.out.printf("Move disk %d from %c to %c\n", n, a, c);
            hanio(n - 1, b, a, c);
        }
    }
}