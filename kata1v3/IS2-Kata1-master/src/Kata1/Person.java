package Kata1;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person {
    
    private final String name;
    private final LocalDate date;
    
    public Person(String name,LocalDate date) {
        this.name = name;
        this.date = date;
    }
    
    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }
    
    public int getAge(){
        return Period.between(date, LocalDate.now()).getYears();
    }
}
