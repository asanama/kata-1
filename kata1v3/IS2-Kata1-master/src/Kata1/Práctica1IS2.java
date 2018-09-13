package Kata1;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;
import java.util.GregorianCalendar;
public class Práctica1IS2 {
    public static void main(String[] args) {
        
        Person ale = new Person("Alejandro",LocalDate.of(1998, Month.APRIL,
                7));
        
        System.out.println(ale.getName() +" tiene: " + ale.getAge() + " años");
    
    
    }
}
