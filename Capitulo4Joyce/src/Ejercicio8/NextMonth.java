package Ejercicio8;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class NextMonth {

    public static void main(String[] args) {
        GregorianCalendar gcal = new GregorianCalendar();

        int dia = gcal.get(Calendar.DAY_OF_MONTH);
        System.out.println((gcal.get(Calendar.DAY_OF_MONTH) + 1)-(gcal.getActualMaximum(Calendar.MONTH)));
    }
}
