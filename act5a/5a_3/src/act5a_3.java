import java.util.Scanner;

public class act5a_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Declaración de variables
        int n;
        System.out.println("Introduzca un número:");
        n = scanner.nextInt();
        //Comprobación de par o impar
        if (n % 2 != 0) {
            System.out.println("El número es impar");
        } else {
            System.out.println("El número es par");
        }


    }
}