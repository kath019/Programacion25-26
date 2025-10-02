import java.util.Scanner;

public class act5a_1 {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        //Declaración de variables
        int n;

        System.out.println("Introduzca un número entero:");
        n=scanner.nextInt();
        if(n>0){
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }
    }
}
