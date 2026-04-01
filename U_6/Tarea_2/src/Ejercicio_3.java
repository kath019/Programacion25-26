//Actividad 3: Pedir números enteros positivos por consola y guardarlos en un fichero binario hasta que se
// introduzca un número negativo. Leer del fichero todos los enteros guardados y mostrarlos por pantalla.

import java.io.*;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese números enteros positivos, para terminar ingrese un número negativo: ");

        try {
            DataOutputStream escribir = new DataOutputStream(new FileOutputStream("ejercicio3.bin"));
            int n;
            do {
                n = sc.nextInt();
                if(n >= 0){
                escribir.writeInt(n);
                }
            } while (n >= 0);
                escribir.close();
            System.out.println("Números guardados correctamente.");

            DataInputStream leer = new DataInputStream(new FileInputStream("ejercicio3.bin"));
            System.out.println("Lectura de números: ");
            try{
                do {
                    int numero = leer.readInt();
                    System.out.println(numero);
                } while (true);

            }  catch (EOFException e) {
                // Fin del fichero (esto es normal)
                System.out.println("Fin del fichero.");
            }
            leer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
