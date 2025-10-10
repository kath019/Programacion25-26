import java.util.Scanner;

public class act5b_19 {
    public static void main(String args []) {
        Scanner sc=new Scanner(System.in);

        //Declaración de variables
        String dia;
        int hora;
        int minutos;
        int respuesta;

        //Ingreso de datos
        System.out.println("Ingrese un día de la semana:");
        dia= sc.next().toLowerCase();
        System.out.println("Ingrese una hora:");
        hora= sc.nextInt();
        System.out.println("Ingrese los minutos de la hora:");
        minutos= sc.nextInt();

        if (dia.equals("lunes")) {
            respuesta= 6660-(minutos+hora*60+24*60);
            System.out.println("Quedan "+respuesta+" min. para el fin de semana");
        }
        if (dia.equals("martes")) {
            respuesta=5220-(minutos+hora*60+24*60);
            System.out.println("Quedan "+respuesta+" min. para el fin de semana");
        }
        if (dia.equals("miércoles")) {
            respuesta=3780-(minutos+hora*60+24*60);
            System.out.println("Quedan "+respuesta+" min. para el fin de semana");
        }
        if (dia.equals("jueves")) {
            respuesta= 2340-(minutos+hora*60+24*60);
            System.out.println("Quedan "+respuesta+" min. para el fin de semana");
        }
        if (dia.equals("viernes")) {
            respuesta=(minutos+hora*60+15*60);
            System.out.println("Quedan "+respuesta+" min. para el fin de semana");
        }
    }
}
