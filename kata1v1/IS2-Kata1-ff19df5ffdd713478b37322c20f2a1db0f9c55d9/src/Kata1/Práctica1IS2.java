package Kata1;
import java.util.Date;
public class Práctica1IS2 {
    public static void main(String[] args) {
        Person ale = new Person("Alejandro",new Date(98,4,7));
        System.out.println(ale.getName() +" tiene: " + ale.getAge() + " años");
    }
}
