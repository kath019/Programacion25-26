import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Act_1 {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     System.out.print("Introduce el nombre del fichero: ");
     String nombreFichero = sc.nextLine();

     // Si no introduce nada, usar prueba.txt por defecto
     if (nombreFichero.trim().isEmpty()) {
         nombreFichero = "prueba.txt";
     }

     String texto = "";
     try {
         BufferedReader in = new BufferedReader(new FileReader(nombreFichero));
         String linea = in.readLine();

         while (linea != null) {
             texto += linea + "\n";
             linea = in.readLine();
         }

         in.close();

     } catch (IOException ex) {
         System.out.println("Error: " + ex.getMessage());
     }

     System.out.println("\nContenido del fichero:");
     System.out.println(texto);

     sc.close();
 }
}

