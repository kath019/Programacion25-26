import java.util.Locale;
import java.util.Scanner;

public class act5b_18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        //Declaración de variables
        double n;
        double m;
        double media;
        String recuperacion;

        //Asignación de las dos notas
        System.out.println("Nota del primer control:");
        n = sc.nextDouble();
        System.out.println("Nota del segundo control:");
        m = sc.nextDouble();

        media = (n + m) / 2;

        if (media >= 5) {
            System.out.println("Tu nota de Programación es: " + media);
        } else {
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto):");
            recuperacion = sc.next();

            if (recuperacion.equals("apto")) {
                System.out.println("Su media es de 5");
            } else {
                System.out.println("Su media es de: " + media);
            }
        }
    }
}
