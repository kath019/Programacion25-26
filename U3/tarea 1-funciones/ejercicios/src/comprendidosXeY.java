import java.util.Scanner;

public class comprendidosXeY {
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int x = sc.nextInt();

        System.out.println("Introduce un segundo número que sea mayor que el primero:");
        int y = sc.nextInt();
        rango(x, y);
        System.out.print(rango);
    }
    public static void rango (int x, int y) {
        if ( x > y || x == y) {

            System.out.println("datos introducidos incorrectamente");

        } else {

            int contador = x;

            do {
                contador++;
                System.out.println(contador+" ");
            } while (y > contador);
        }
    }
}
