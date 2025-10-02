import java.util.Scanner;

public class act5a_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaración de variables
        double gravedad=9.8;
        double tiempo;
        double velocidad;

        //Cálculo de la velocidad
        System.out.print("Ingresa el valor del tiempo:");
        tiempo = sc.nextDouble();
        if(tiempo<=0) {
            System.out.println("Tiempo incorrecto");
        } else {
        System.out.print("La velocidad tiene un valor de:");
        System.out.println(gravedad*tiempo+"m/s"); }
    }
}
