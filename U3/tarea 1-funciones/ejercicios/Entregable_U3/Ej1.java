import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        //Primero definimos la longitud del que será el Array 'a'
        System.out.println("Introduce la longitud del  primer Array:");
        int longA = sc.nextInt();

        //Se introducen los valores del Array
        System.out.println("Introduce los valores del Array:");
        int [] a = new int[longA];
        for (int i = 0; i < longA; i++) {
            a [i] = sc.nextInt();
        }

        //Definimos la longitud del que será el Array 'b'
        System.out.println("Introduce la longitud del  segundo Array:");
        int longB = sc.nextInt();

        //Se introducen los valores del Array
        System.out.println("Introduce los valores del Array:");
        int [] b = new int[longB];
        for (int i = 0; i < longB; i++) {
            b [i] = sc.nextInt();
        }
        //Se llama la función y se muestra
        System.out.println(Arrays.toString(mezcla(a, b)));

    }

    //Función para crear la función de Arrays
    public static int [] mezcla (int [] a, int [] b){

        int longA = a.length;
        int longB =b.length;

        //Se crea el Array que fusionará 'a' y 'b'
        int [] fusion = new int [(a.length+b.length)];

        int i = 0, j = 0, k = 0;

        //Se crea un bucle para rellenar el nuevo Array de forma salteada
        while (i < longA && j < longB) {

            if( !(a[i] % 2 == 0)  ) {
                fusion [k++] =a[i++];
            } else {
                fusion[k++] = b[j++];
            }
        }

        //Bucle por si queda algún espacio por llenar
        while (i < longA) {
            fusion[k++] = a[i++];
        }
        while (j < longB) {
            fusion[k++] = b[j++];
        }

        return fusion;
    }
}
