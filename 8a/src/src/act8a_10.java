import java.util.Scanner;

public class act8a_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaración de variables
        int a=0;
        int i;
        int b = 1;
        int c;

        //Asignación de un valor para a
        do {
            System.out.println("Ingresa un número entre 1 a 10:");
            a=sc.nextInt();
            if (a<1 || a>10) {
                System.out.println("Valor no válido");
            }
        } while (a<1 || a>10);

        //Tabla de multiplicar
        System.out.println("Tabla de multiplicar de "+a+":");
        for (i=1;i<=12;i++) {
            c=a*i;
            System.out.println(c);
        }
    }
}
