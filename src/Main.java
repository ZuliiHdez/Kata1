import es.ulpgc.kata1.Person;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate date;
        date= LocalDate.of(2006,06,28);
        Person persona = new Person("Byron",date);
        System.out.println(persona.getNombre() + " tiene " + persona.getEdad());

    }
}