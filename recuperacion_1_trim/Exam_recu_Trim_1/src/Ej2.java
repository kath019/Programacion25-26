import java.util.Scanner;

public class Ej2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        //Se pide que se ingresen los datos
        System.out.print("Porfavor introduzca un número entero positivo: ");
        long original = sc.nextLong();
        System.out.print("Introduzca la posición dentro del número: ");
        int posicion = sc.nextInt();
        System.out.print("Introduzca el nuevo dígito: ");
        int nuevo = sc.nextInt();

        //calcular la posición donde se cambiará el número
        long temp = original;
        long divisor = 1;
        int digito = 0;
        while (temp > 0) {
            temp /= 10;
            digito++;
        }

        //bucle para saber la posición de cada número
        for (long i = 0; i < (digito - (posicion - 1)); i++ ){
            divisor *=10;
        }
        //obtenemos la primera parte del número
        long parte1 = original / divisor;

        //calculamos la segunda parte del nuevo número
        long parte2 = original % (divisor / 10);

        //mostramos el nuevo número
        System.out.print("El número resultante es: " + parte1 + nuevo + parte2);
    }
}
