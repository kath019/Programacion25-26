import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class act4_5 {

    public static void main(String args[]) {
        //Obtención de la hora actual
        LocalTime hora = LocalTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("La hora actual es:"+ hora.format(formato));

    }
}
