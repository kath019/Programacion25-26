import java.util.Scanner;

public class act5b_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaración de variable
        int n;

        //Asociación del número al sía de la semana
        System.out.println("Introduzca un número:");
        n = sc.nextInt();
        if (n == 1) {
            System.out.println("Lunes");
        } else if (n == 2) {
            System.out.println("Martes");
        }  else if (n == 3) {
            System.out.println("Miércoles");
        }  else if (n == 4) {
            System.out.println("Jueves");
        }   else if (n == 5) {
            System.out.println("Viernes");
        } else  if (n == 6) {
            System.out.println("Sabado");
        }   else if (n == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("Número no válido");
        }
    }
}
