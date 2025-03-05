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
