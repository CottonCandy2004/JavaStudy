/**
 * @Author: CottonCandy2004
 * @Discription: Prints the leap years between 1950 and 2050, resolve 1.
 */

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
