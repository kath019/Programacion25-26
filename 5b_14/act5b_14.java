import java.awt.*;
import java.util.Scanner;

public class act5b_14 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        //Declaración de variable
        char m;
        int opcion;

        //Elección de la variable
        System.out.println("Introduzca un número, símbolo o letra");
        m=sc.next().charAt(0);

        //Elección de dirección del vértice
        System.out.println("Seleccione hacia donde debe apuntar el vértice de la pirámide");
        System.out.println("1. Hacia arriba");
        System.out.println("2. Hacia abajo");
        System.out.println("3. Hacia la derecha");
        System.out.println("4. Hacia la izquierda");
        System.out.println("Opción:");
        opcion=sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("    "+m);
                System.out.println("   "+m+" "+m);
                System.out.println("  "+m+" "+m+" "+m);
                System.out.println(" "+m+" "+m+" "+m+" "+m);
                break;
            case 2:
                System.out.println(" "+m+" "+m+" "+m+" "+m);
                System.out.println("  "+m+" "+m+" "+m);
                System.out.println("   "+m+" "+m);
                System.out.println("    "+m);
                break;
            case 3:
                System.out.println(m);
                System.out.println(m+" "+m);
                System.out.println(m+" "+m+" "+m);
                System.out.println(m+" "+m+" "+m+" "+m);
                System.out.println(m+" "+m+" "+m);
                System.out.println(m+" "+m);
                System.out.println(m);
                break;
            case 4:
                System.out.println("      "+m);
                System.out.println("    "+m+" "+m);
                System.out.println("  "+m+" "+m+" "+m);
                System.out.println(m+" "+m+" "+m+" "+m);
                System.out.println("  "+m+" "+m+" "+m);
                System.out.println("    "+m+" "+m);
                System.out.println("      "+m);
                break;
            default:
                System.out.println("Opción no válida");

        }


    }
}
