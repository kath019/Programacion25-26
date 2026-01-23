import java.util.Scanner;

public class Ej1 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el ancho de la pecera, mínimo 4: ");
        int ancho = sc.nextInt();

        System.out.print("Introduzca la altura de la pecera, mínimo 4: ");
        int altura = sc.nextInt();


        //Usamos bucles para crear la pecera
        for(int i = 0; i < altura; i++) {
            //borde izquierdo
            System.out.print("* ");

            //Fila de arriba
            if (i == 0 || i == altura - 1) {
                for (int j = 1; j < ancho; j++) {
                    System.out.print("* ");
                }
            } else {
                //espacios internos
                for (int j = 1; j < ancho - 1; j++) {
                    if ( j == (ancho - 2)) {
                        System.out.print("& ");
                    } else {
                        System.out.print("  ");
                    }
                }
                //borde derecho
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
