import java.util.Scanner;

public class act5a_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declaración de variables
        long n;
        long m;
        long r;

        // Asignación de valores para las variables
        System.out.println("Introduzca tres números:");
        n = sc.nextLong();
        m = sc.nextLong();
        r = sc.nextLong();

        // Cálculo del número mayor
        System.out.println("El mayor de los tres números es:");
        if (n > m && n > r) {
            System.out.println(n);
        } else if (n < m && m > r) {
            System.out.println(m);
        } else {
            System.out.println(r);
        }
        }

    }

