import java.util.Scanner;

public class act4_4 {
    public static void main(String args[]) {
        Scanner scanner= new Scanner(System.in);

        //Declaración de variables
        double n;
        int m;
        System.out.println("Introduzca un número decimal:");
        n=scanner.nextDouble();

        //Redondeo del número
        System.out.println("Número redondeado:");
        m = (int) Math.round(n);
        System.out.println(m);
    }
}
