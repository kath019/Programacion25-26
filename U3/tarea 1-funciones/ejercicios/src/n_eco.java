import java.util.Scanner;

public class n_eco {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Introduzca la cantidad de veces que quiere ver el mensaje 'Eco': ");
        n = sc.nextInt();
        eco (n);
        System.out.print(n);
    }
    public static int eco(int n) {
        int i;
        for (i = 1; i <= n; i++) {
            System.out.println("Eco...");
        }
        return i;
    }
}
