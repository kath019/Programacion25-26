import java.util.Scanner;

public class nMayor {
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el primer numero:");
        int n1 = sc.nextInt();

        System.out.print("Introduzca el segundo número:");
        int n2 = sc.nextInt();

        System.out.println("El mayor de los dos numeros es:");
        nmayor(n1, n2);
    }

    public static void nmayor (int n1, int n2) {
        if ( n1 < n2) {
            System.out.println(n2);
        } else {
            System.out.println(n1);
        }
        return;
    }
}
