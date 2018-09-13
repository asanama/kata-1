package Kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person {
    
    private final String name;
    private final Calendar date;
    private final long YEARMILI = (long) (365.25*1000*60*60*24);

    public Person(String name,Calendar date) {
        this.name = name;
        this.date = date;
    }
    
    public String getName() {
        return name;
    }

    public Calendar getDate() {
        return date;
    }
    
    public int getAge(){
        Calendar today = GregorianCalendar.getInstance();
        return (int) (miliSecondsToYear(
                today.getTimeInMillis()- date.getTimeInMillis()));
    }
    
    private long miliSecondsToYear(long milles){
        return milles / YEARMILI;
    }
}
