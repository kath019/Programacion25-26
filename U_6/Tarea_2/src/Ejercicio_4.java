//Actividad 4: Pedir un entero n por consola. A continuación, pedir n números double,
// que iremos guardando en una tabla. Guardar la tabla en un archivo binario.

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la cantidad de datos a guardar: ");
        int n = sc.nextInt();

        System.out.println("Introduzca los datos:");
        double [] tabla = new double[(int) n];
        for (int i = 0; i < n; i++){
            tabla[i] = sc.nextDouble();
        }

        try {
            DataOutputStream escribir = new DataOutputStream(new FileOutputStream("array.bin"));
            //guardar el tamaño del array
            escribir.writeInt(n);  // ESTO ES CLAVE

            for (int i = 0; i < n; i++){
                escribir.writeDouble(tabla[i]);
            }
            escribir.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
