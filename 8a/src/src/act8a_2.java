import java.util.Scanner;

public class act8a_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaración de variables
        int edad;
        int contador=0;
        int suma=0;
        double media=0;
        int mayores=0;

        //Bucle hasta que se introduzca una edad negativa
        do {
            System.out.print("Introducir edad de los alumnos (para terminar, introducir número negativo): ");
            edad = sc.nextInt();
            if (edad>=0) {
                contador++;
                if (edad >= 18) {
                    mayores++;
                }
                suma += edad;
                if (contador >0) {
                    media = (double) suma / contador;
                }
                }
        } while (edad>0);
        System.out.println("Mayores: "+mayores);
        System.out.println("Suma de edades: "+suma);
        System.out.println("Media de todos los alumnos: "+media);
    }
}

