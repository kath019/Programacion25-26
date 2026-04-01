//Actividad 6: En un fichero binario, sabemos que se ha guardado una serie de números double,
// pero no sabemos cuántos. Implementar un programa que los lea todos y los muestre por pantalla.

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Ejercicio_6 {
    public static void main(String[] args) {
        try{
            DataInputStream leer = new DataInputStream(new FileInputStream("array.bin"));
            System.out.println("Números leídos:");

            try {
                while (true) {
                    double numero = leer.readDouble();
                    System.out.println(numero);
                }
            } catch (EOFException e) {
                // Fin del fichero (esto es normal)
                System.out.println("Fin del fichero.");
            }
            leer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
