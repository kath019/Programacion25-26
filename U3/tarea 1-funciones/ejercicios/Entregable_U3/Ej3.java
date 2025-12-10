import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej3 {
    public static void main (String [] args ) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        //Creación del Array
        int [][] n = new int[6][4];

        System.out.println("Introduce los valores del Array:");
        //Bucle para ingresar los valores
        for (int a = 0; a < 3; a++) {
            for (int m = 0; m < 5; m++) {
                n[a][m] = sc.nextInt();
            }
        }
        System.out.println(Arrays.toString(n));
    }

    public static int[] corteza(int[][] n) {
        int [] nuevo = new int[12];
        for (int i = 0; i < 3; i++) {

        }
    }
}
