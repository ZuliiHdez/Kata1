package software.ulpgc.kata1;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String nombre;
    private LocalDate cumpleaños;
    private long MILLISECONDS_PER_YEAR = (long) (100*60*60*24*365.25);

    public Person(String nombre, LocalDate cumpleaños) {
        this.nombre = nombre;
        this.cumpleaños = cumpleaños;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getCumpleaños() {
        return cumpleaños;
    }
    public int getEdad(){
        return (int) (Period.between(cumpleaños,LocalDate.now()).getYears());
    }

    public long milliSecondsToYear(long milles) {
        return milles/MILLISECONDS_PER_YEAR;
    }
}
