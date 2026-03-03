import java.io.*;
import java.util.Scanner;

public class Act_7 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del archivo: ");
        String nombreArchivo = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {

            String linea;
            int contador = 0;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                contador++;

                // Cada 24 líneas
                if (contador % 24 == 0) {
                    System.out.println("\n--- Pulse ENTER para continuar ---");
                    sc.nextLine();
                }
            }

            System.out.println("\n*** Fin del archivo ***");

        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }

        sc.close();
    }
}
