import java.util.Scanner;

public class act8a_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Decalaración de variables
        int a;
        int b=1;
        int c;

        //Pedir un valor para la variable
        System.out.println("Introduzca un número:");
        a=sc.nextInt();
        System.out.println("El factorial de "+a+" sería:");

        //Bucle para calcular el factorial
        for (c=1; c<=a; c++) {
                b*=c;
        }
        System.out.println(b);
    }
}
