import java.util.Scanner;

public class act5b_17 {
    public static void main (String args[]) {
        Scanner sc= new Scanner(System.in);

        //Declaración de variables
        int n;
        int m;

        //Asignación de un valor para la variable
        System.out.println("Introduzca un número entero de máximo 5 cifras:");
        n= sc.nextInt();

        System.out.println("El primer dígito de "+n+" es:");


        //Condiciones para que se cumpla el enunciado
        if (n<100000) {
            if (n < 100000 && n > 10000) {
                m = n / 10000;
                System.out.println(m);
            }
            if (n < 10000 &&n > 1000) {
                m = n / 1000;
                System.out.println(m);
            }
            if (n < 1000 && n > 100) {
                m = n / 100;
                System.out.println(m);
            }
            if (n < 100 && n > 10) {
                m = n / 10;
                System.out.println(m);
            }
            if (n < 10) {
                m = n;
                System.out.println(m);
            }
        } else {
            System.out.println("Número introducido no válido");
        }
    }
}
