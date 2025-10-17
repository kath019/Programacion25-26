import java.util.Scanner;

public class Ej3 {
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);

        //Declaración de variables
        int a, i, j, mitad;

        //Asignación de un valor para 'a'
        System.out.println("Introduzca un valor impar mayor o igual a 3 para la altura del reloj de arena:" );
        a = sc.nextInt();

        mitad = a/2;

        //Condicional para aegurarse de que el valor sea correcto
        if (a <= 3 && a % 2 == 0) {
            System.out.println("Error");
        } else {
            for (i = 0; i <= mitad; i++) {
                for (j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }

    }
}
