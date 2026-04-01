//Actividad 2: Abrir el archivo del ejercicio anterior, leer el double y mostrarlo por pantalla

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio_2 {
    public static void main(String[] args) {
        try{
            DataInputStream binario = new DataInputStream(new FileInputStream("archivo.bin"));

            double numero = binario.readDouble();
            System.out.println("El numero es: " + numero);
            binario.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
