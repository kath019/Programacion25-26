import java.util.Scanner;

public class act8a_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaración de variables
        int n;
        int i;
        int j;
        int contador=0;

        //Asignación de un valor para la variable
        System.out.println("Introduzca un número: ");
        n = sc.nextInt();

        System.out.println("Números primos entre 1 y "+n+":");

        //Cálculo de los números primos
        for (i = 2; i < n; i++) {
            boolean primo=true;
            for (j = 2; j < i; j++) {
                if (i%j==0) {
                    primo=false;
                    break;
                }
            }
            if (primo==true) {
                contador++;
            }
        }
        System.out.println(contador);
    }
}
