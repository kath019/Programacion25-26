import java.util.Scanner;

public class act5a_2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        //Declaración de variables
        int n;
        //Pedir al usuario el número 12
        System.out.println("Introduzca el número 12:");
        n = scanner.nextInt();
        if (n == 12) {
            System.out.println("Se hizo correctamente");
        } else {
            System.out.println("Se hizo incorrectamente");
        }
    }
}