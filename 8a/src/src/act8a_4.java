import java.util.Scanner;

public class act8a_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaración de variables
        int n;
        int contador=1;

        System.out.println("Inserte un número:");
        n = sc.nextInt();
        System.out.println("Numeros desde 1 hasta "+n);

        //Bucle desde 1 hasta n
        do {
            if (contador<=n) {
                System.out.println(contador++);
            };
        } while (true);
    }
}
