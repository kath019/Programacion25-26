package mm;

import java.util.Scanner;

public class act3_3 {
    public static void main (String args[]) {
        Scanner scanner= new Scanner(System.in);
        //Declaración de variables
        double n1;
        double n2;
        double resultado;
        System.out.println("Introduzca un número:");
        n1= scanner.nextDouble();
        System.out.println("Introduzca otro número:");
        n2= scanner.nextDouble();
        if (n2 != 0)
        { resultado = n1 / n2;
            System.out.println("El resultado es:");
            System.out.println(resultado);
        } else {
            System.out.println("Error: No se puede dividir entre 0");
        }
        scanner.close();
    }
}