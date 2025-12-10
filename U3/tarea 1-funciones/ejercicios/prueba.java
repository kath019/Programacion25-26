import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] tabla = new int[100];
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int)(Math.random()*501);
        }
        for (int i = 0; i < tabla.length; i++) {
            System.out.print(tabla[i]+" ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println("Introduzca 1 si desea ver el mínimo o 2 si desea ver el máximo:");
        int opcion = sc.nextInt();

        int destacar = tabla[0];

        if (opcion < 1 || opcion > 2) {
            System.out.println("Opción no existente");
        } else if (opcion == 1) {
            for (int recorre: tabla) {
                if (recorre < destacar) destacar = recorre;
            }

        } else {
            for (int recorre: tabla) {
                if (recorre > destacar) destacar = recorre;
            }
        }

        for (int i = 0; i < tabla.length; i++) {
            if (tabla [i] == destacar) {
                System.out.print("**"+ destacar +"** ");
            }
            if((i + 1) % 10 == 0){
                System.out.println();
            }
        }
    }
}

