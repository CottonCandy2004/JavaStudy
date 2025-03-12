/**
 * @Author: CottonCandy2004
 * @Discription: Prints a 9*9 multiplication table.
 */

package Homework1.Problem3;

public class NineTimesNine {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = i; j > 1; j--) {
                System.out.print("\t");
            }
            for (int p = i; p < 10; p++) {
                if (p != 9){
                    System.out.print(p + "*" + i + "=" + i * p + "\t");
                } else {
                    System.out.print(p + "*" + i + "=" + i * p);
                }
            }
            System.out.println();
        }
    }
}
