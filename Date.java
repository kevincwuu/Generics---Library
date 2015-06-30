package GenericsLibrary;

import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;

public class Date implements Comparable<Date> {
    GregorianCalendar gcalendar = new GregorianCalendar();
    Date date;
    int year;
    String months[] = {
            "Jan", "Feb", "Mar", "Apr",
            "May", "Jun", "Jul", "Aug",
            "Sep", "Oct", "Nov", "Dec"};

    public Date(int year, int month, int date) {
        gcalendar.set(year, month, date);
    }

    @Override
    public int compareTo(Date date) {

        if(gcalendar.getTime().compareTo(date.gcalendar.getTime()) < 0) {
            return -1;
        } else if (gcalendar.getTime().compareTo(date.gcalendar.getTime()) > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        year = gcalendar.get(Calendar.YEAR);
        System.out.print("Date: ");
        String str = months[gcalendar.get(Calendar.MONTH)] +
                " " + gcalendar.get(Calendar.DATE) + " " + year;
        return str;
    }
}
