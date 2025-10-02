import java.util.Locale;
import java.util.Scanner;

public class act5b_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //Declaración de variable
        String dia;


        System.out.println("Introduzca un día de la semana:");
        dia= scanner.nextLine().toLowerCase();;
        System.out.println("El "+dia+" a primera hora toca:");
        switch (dia) {
            case "lunes":
                System.out.println("Base de datos");
                break;
            case "martes":
                System.out.println("Programación");
                break;
            case "miercoles":
                System.out.println("Programación");
                break;
            case "jueves":
                System.out.println("Entornos de Desarrollo");
                break;
            case "viernes":
                System.out.println("Programación");
                break;
            case "sabado":
                System.out.println("Ese día no hay clase :)");
                break;
            case "domingo":
                System.out.println("Ese día no hay clase :)");
                break;
            default:
                System.out.println("Día no válido");
        }

    }
}
