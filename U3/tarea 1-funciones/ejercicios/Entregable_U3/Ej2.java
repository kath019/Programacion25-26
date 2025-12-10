import java.util.Scanner;

public class Ej2 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        //Se solicita al usuario que introduzca 20 numeros
        System.out.println("Introduzca 20 números enteros:");
        int[][] tabla = new int [4][5];

        //Bucle para ingresar los valores
        for (int n = 0; n < 4; n++) {
            for (int m = 0; m < 5; m++) {
                tabla[n][m] = sc.nextInt();
            }
        }

        //Mostrar los valores en la tabla
        System.out.println("Contenido de la tabla 4x5:");
        int fila = 0;
        for (int n = 0; n < 4; n++) {
            for (int m = 0; m < 5; m++) {

                // Se añade formato para alinear los números
                System.out.printf("%4d", tabla[n][m]);
            }

            //Para imprimir una nueva línea
            System.out.println();
        }

        int valor = 0;

    }
}
