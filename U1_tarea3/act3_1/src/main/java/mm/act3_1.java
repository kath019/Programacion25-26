package mm;

import java.util.Scanner;

public class act3_1 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        byte n1;
        byte n2;
        byte suma;
        System.out.println("Introduzca un número de dos cifras");
        n1= scanner.nextByte();
        System.out.println("Introduzca otro número de dos cifras");
        n2= scanner.nextByte();
        System.out.println("Suma de "+n1+ " y "+n2);
        suma= (byte) (n1+n2);
        System.out.println(suma);

    }
}
