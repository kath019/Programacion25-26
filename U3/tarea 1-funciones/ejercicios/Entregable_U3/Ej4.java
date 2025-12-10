import java.util.Scanner;

public class Ej4 {
    public static void main (String [] args ) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la longitud del Array:");
        int longitud = sc.nextInt();

        System.out.println("Introduce los valores que contendrá el Array:");
        int [] a = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            a [i] = sc.nextInt();
        }

    }


    public static String convierteArrayEnString(int[] a) {

    }
}
