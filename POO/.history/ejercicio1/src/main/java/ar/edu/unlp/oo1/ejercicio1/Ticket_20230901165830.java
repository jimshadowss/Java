package ar.edu.unlp.oo1.ejercicio1;
import java.time.LocalDate;
public class Ticket {
    LocalDate fecha;
    
    public Ticket(String cliente){
        fecha=LocalDate.now();
    }
}
