package mm;

import java.util.Scanner;

public class act3_2 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        //Declaración de variables
        int añoactual;
        int añonac;
        int diferencia;
        System.out.println("Introduzca el año actual");
        añoactual= scanner.nextInt();
        System.out.println("Introduzca su año de nacimiento");
        añonac= scanner.nextInt();
        System.out.println("Su edad es:");
        diferencia= (int) (añoactual-añonac);
        System.out.println(diferencia);

    }

}
