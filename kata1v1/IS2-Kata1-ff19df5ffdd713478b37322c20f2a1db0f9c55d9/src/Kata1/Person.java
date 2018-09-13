package Kata1;

import java.util.Date;

public class Person {
    
    private final String name;
    private final Date date;

    public Person(String name,Date date) {
        this.name = name;
        this.date = date;
    }
    
    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }
    
    public int getAge(){
        return (int) ((new Date().getTime()-this.date.getTime())/31557600000L);
    }
}
