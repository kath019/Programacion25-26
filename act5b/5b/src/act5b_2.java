import java.util.Scanner;

public class act5b_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaración de variable
        int hora;
        System.out.println("Introduzca una hora:");
        hora = sc.nextInt();
        if (hora>=6 && hora<=12){
            System.out.println("Buenos días");
        } else if (hora>=13 && hora<=20){
            System.out.println("Buenas tardes");
        }  else if (hora>=21 && hora<=24){
            System.out.println("Buenas noches");
        } else if (hora>=0 && hora<=5){
            System.out.println("Buenas noches");
        } else {
            System.out.println("Hora no válida");
        }
        sc.close();
    }
}