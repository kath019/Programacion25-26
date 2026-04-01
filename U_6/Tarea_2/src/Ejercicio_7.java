//Actividad 7: Escribir por teclado una frase y guardarla en un archivo binario.
// A continuación, recuperarla del archivo y mostrarla por pantalla.

import java.io.*;
import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();

        try {
            // ESCRIBIR
            DataOutputStream escribir = new DataOutputStream(new FileOutputStream("frase.bin"));
            escribir.writeUTF(frase);
            escribir.close();
            System.out.println("Frase guardada correctamente.");

            // LEER
            DataInputStream leer = new DataInputStream(new FileInputStream("frase.bin"));
            String leida = leer.readUTF();
            leer.close();
            System.out.println("Frase leída: " + leida);

        } catch (IOException e) {
            System.out.println("Error en el manejo del archivo.");
        }
    }
}
