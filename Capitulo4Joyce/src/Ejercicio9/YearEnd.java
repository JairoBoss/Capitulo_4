package Ejercicio9;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class YearEnd {
    public static void main(String[] args) {
        GregorianCalendar gcal = new GregorianCalendar();

        System.out.println((gcal.getMaximum(Calendar.DAY_OF_YEAR) - (gcal.get(Calendar.DAY_OF_YEAR) + 1)));
    }
}
