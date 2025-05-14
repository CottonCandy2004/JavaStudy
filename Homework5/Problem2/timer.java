package Homework5.Problem2;

import java.lang.String;
import java.time.LocalDate;
import java.time.LocalTime;

public class timer {
    static String getFormatTime(boolean ifsecond, boolean if24h)
    {
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if (!if24h) {
            if (hour > 12) {
                hour -= 12;
            }
            if (hour == 0) {
                hour = 12;
            }
        }
        String res = "";
        if (!ifsecond) {
            res = String.format("%s %02d:%02d", if24h ? "" : (time.getHour() > 12 ? "PM" : "AM"), hour, time.getMinute());
        } else {
            res = String.format("%s %02d:%02d:%02d", if24h ? "" : (time.getHour() > 12 ? "PM" : "AM"), hour, time.getMinute(), time.getSecond());
        }
        return res;
    }
    static String getFormatDate(boolean ifweek)
    {
        LocalDate date = LocalDate.now();
        String res = "";
        String week[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        if (ifweek) {
            res = String.format("%04d-%02d-%02d %s", date.getYear(), date.getMonthValue(), date.getDayOfMonth(), week[date.getDayOfWeek().getValue()]);
        } else {
            res = String.format("%04d-%02d-%02d", date.getYear(), date.getMonthValue(), date.getDayOfMonth());
        }
        return res;
    }
}
