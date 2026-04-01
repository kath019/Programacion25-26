//Actividad 8: Crear una tabla de números aleatorios menores que 100, ordenados de menor a mayor,
// y guardarlos en un fichero binario. A continuación, recuperarlos y mostrarlos por consola.

import java.io.*;
import java.util.Arrays;

public class Ejercicio_8 {
    public static void main(String[] args){
        int n = 10; // cantidad de números
        int[] tabla = new int[n];

        // GENERAR números aleatorios menores que 100
        for (int i = 0; i < n; i++) {
            tabla[i] = (int)(Math.random() * 100);
        }

        // ORDENAR de menor a mayor
        Arrays.sort(tabla);

        try {
            // ESCRIBIR en fichero binario
            DataOutputStream escribir = new DataOutputStream(new FileOutputStream("ejercicio8.bin"));

            // Guardar el tamaño
            escribir.writeInt(n);

            // Guardar los números
            for (int i = 0; i < n; i++) {
                escribir.writeInt(tabla[i]);
            }

            escribir.close();
            System.out.println("Números guardados correctamente.");

            // LEER del fichero
            DataInputStream leer = new DataInputStream(new FileInputStream("ejercicio8.bin"));

            int tamanio = leer.readInt();

            System.out.println("Números leídos:");

            for (int i = 0; i < tamanio; i++) {
                int num = leer.readInt();
                System.out.println(num);
            }

            leer.close();

        } catch (IOException e) {
            System.out.println("Error en el archivo.");
        }
    }
}
