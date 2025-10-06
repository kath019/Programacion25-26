import java.util.Scanner;
import java.lang.Math;
public class act5b_8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Declaración de variables
        double a;
        double b;
        double c;
        double x1;
        double x2;

        System.out.println("Resolución de la ecuación de segundo grado: ax^2+bx+c=0");

        //Solicitar al usuario valores para las variables
        System.out.println("Introduzca un valor para a:");
        a= sc.nextDouble();
        System.out.println("Introduzca un valor para b:");
        b= sc.nextDouble();
        System.out.println("Introduzca un valor para c:");
        c=sc.nextDouble();

        //Cálculo del discriminante
        double discriminante = b * b - 4 * a * c;

        if (discriminante==0) {
            x1=-b/2*a;
            System.out.println("La ecuación tiene una única solución: "+x1);
        } else if (discriminante>=1) {
            x1=(-b+discriminante)/2*a;
            x2=(-b-discriminante)/2*a;
            System.out.println("La ecuación tiene dos soluciones: "+x1+" y "+x2);
        } else {
            System.out.println("La ecuación no tiene solución");
        }

    }
}
