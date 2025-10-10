import java.util.Scanner;
public class act5b_9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Declaración de variables
        int n;
        int mes;
        String signo = "";

        System.out.println("Introduzca su fecha de nacimiento:");
        n = sc.nextInt();
        System.out.println("Introduzca su mes de nacimiento (1-12):");
        mes = sc.nextInt();

        //Asociación del día y el mes con el signo
        switch (mes) {
            case 1://Enero
                if (n <= 19) {
                    signo = "Capricornio";
                } else {
                    signo = "Acuario";
                }
                break;
            case 2://Febrero
                if (n <= 18) {
                    signo = "Acuario";
                } else {
                    signo = "Piscis";
                }
                break;
            case 3://Marzo
                if (n<=20) {
                    signo="Piscis";
                } else {
                    signo="Aries";
                }
                break;
            case 4://Abril
                if (n<=19) {
                    signo="Aries";
                } else {
                    signo="Tauro";
                }
                break;
            case 5://Mayo
                if (n<=20) {
                    signo="Tauro";
                } else {
                    signo="Géminis";
                }
                break;
            case 6://Junio
                if (n<=20) {
                    signo="Géminis";
                } else {
                    signo="Cáncer";
                }
                break;
            case 7://Julio
                if (n<=22) {
                    signo="Cáncer";
                } else {
                    signo="Leo";
                }
                break;
            case 8://Agosto
                if (n<=22) {
                    signo="Leo";
                } else {
                    signo="Virgo";
                }
                break;
            case 9://Septiembre
                if (n<=22) {
                    signo="Virgo";
                } else {
                    signo="Libra";
                }
                break;
            case 10://Octubre
                if (n<=22) {
                    signo="Libra";
                } else {
                    signo="Escorpio";
                }
                break;
            case 11://Noviembre
                if (n<=21) {
                    signo="Escorpio";
                } else {
                    signo="Sagitario";
                }
                break;
            case 12://Diciembre
                if (n<=21) {
                    signo="Sagitario";
                } else {
                    signo="Capricornio";
                }
                break;
            default:
                signo="Mes no válido";

        }
        System.out.println("Su horóscoo es: "+signo);
    }
}
