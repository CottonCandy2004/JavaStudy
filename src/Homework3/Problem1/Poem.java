/**
 * @Author: CottonCandy2004
 * @Discription: Prints a poem.
 */

package Homework3.Problem1;

public class Poem {
    public static void main(String[] args) {
        String[] poem = {"锄禾日当午，", "汗滴禾下土。", "谁知盘中餐，", "粒粒皆辛苦。"};
        for (int i = 0; i < 4; i++) {
            System.out.println(poem[i]);
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            for (int j = 3; j >= 0; j--) {
                System.out.print(poem[j].charAt(i));
            }
            System.out.println();
        }
    }
}
