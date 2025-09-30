package mm;

import java.util.Scanner;

public class act3_4 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        //Declaración de variables
        float m;
        float k;
        System.out.println("Introduzca una cantidad de millas");
        m= scanner.nextFloat();
        System.out.println("Su equivalencia en kilómetros es de:");
        k= m*1609;
System.out.println(k+"km");
    }
}
