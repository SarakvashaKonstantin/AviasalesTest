package utils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {

    Date date = new Date();
    GregorianCalendar calendar = new GregorianCalendar();

    public String currentDate(){
        String str = String.format("%te ",date);
        String str2 = String.format("%tb",date);
        String str3 = String.format(" %tY, ",date);
        String str4 = String.format("%ta",date);
        return (str+str2.substring(0, str2.length() - 1)+str3+str4);
    }

    public String tomorrowDate(){
        return String.valueOf((calendar.get(Calendar.DAY_OF_MONTH))+1);
    }

    public String dayAfterTomorrow(){
        return String.valueOf((calendar.get(Calendar.DAY_OF_MONTH))+2);
    }
}
