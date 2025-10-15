import java.util.Scanner;

public class act8a_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaración de variables
        int maximo;
        int minimo;
        int n;

        //Petición del máximo y el mínimo
        System.out.print("Ingrese un valor máximo: ");
        maximo = sc.nextInt();
        System.out.print("Ingrese un valor minimo: ");
        minimo = sc.nextInt();

        //Bucle hasta que el valor esté en el rango
        do {
            System.out.print("Ingrese un valor que esté dentro del rango: ");
            n = sc.nextInt();
            if (n<minimo || n>maximo) {
                System.out.println("Vuelva a introducir el número");
            }else {
                System.out.println("Valor válido");
                break;
            }
        } while (true);
    }
}
