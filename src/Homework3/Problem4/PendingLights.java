/**
 * @Author: CottonCandy2004
 * @Discription: PendingLights.
 */

package Homework3.Problem4;

public class PendingLights {
    public static void main(String[] args) {
        boolean[] lights = new boolean[100];
        for (int i = 0; i < 100; i++) {
            lights[i] = false;
        }
        for (int i = 1; i <= 100; i++) {
            for (int j = i - 1; j < 100; j += i) {
                lights[j] = !lights[j];
            }
        }
        for (int i = 0; i < 100; i++) {
            if (lights[i]) {
                System.out.print(i + 1 + " ");
            }
        }
    }
}
