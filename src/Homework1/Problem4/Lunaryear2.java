/**
 * @Author: CottonCandy2004
 * @Discription: Prints the leap years between 1950 and 2050, resolve 2.
 */

package Homework1.Problem4;

import java.time.Year;
public class Lunaryear2 {
    public static void main(String[] args) {
        for(int year = 1950; year <= 2050; year++)
        {
            if(Year.isLeap(year))
            {
                System.out.printf("%d ", year);
            }
        }
    }
}
