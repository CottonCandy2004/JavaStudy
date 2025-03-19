/**
 * @Author: CottonCandy2004
 * @Discription: PendingWeek.
 */
package Homework3.Problem3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
public class PendingWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input the date, such as 2022-10-10:");
        String date = sc.next();
        sc.close();
        String[] dateArr = date.split("-");
        int year = Integer.parseInt(dateArr[0]);
        int month = Integer.parseInt(dateArr[1]);
        int day = Integer.parseInt(dateArr[2]);
        LocalDate localDate = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(date + " is " + dayOfWeek);
    }
}
