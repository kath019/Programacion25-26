//Actividad 5: Leer del fichero de ejercicio anterior la tabla de números.
// Mostrar el contenido de la tabla por consola.

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio_5 {
    public static void main(String[] args) {
        try{
            DataInputStream leer = new DataInputStream(new FileInputStream("array.bin"));
            //leer el tamaño del array
            int tamanio = leer.readInt();

            //crear el array
            double [] tabla2 = new double[tamanio];
            for ( int i = 0; i < tamanio; i++ ){
                tabla2 [i] = leer.readDouble();
                System.out.println("Número " + (i+1) + " : " + tabla2[i]);
            }
            leer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
