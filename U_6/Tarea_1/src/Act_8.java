import java.io.*;
public class Act_8 {
     public static void main(String[] args) {

         try (
                 BufferedReader br1 = new BufferedReader(new FileReader("perso1.txt"));
                 BufferedReader br2 = new BufferedReader(new FileReader("perso2.txt"));
                 BufferedWriter bw = new BufferedWriter(new FileWriter("todos.txt"))
         ) {

             String linea1 = br1.readLine();
             String linea2 = br2.readLine();

             // Mientras ambos archivos tengan líneas
             while (linea1 != null && linea2 != null) {

                 if (linea1.compareToIgnoreCase(linea2) <= 0) {
                     bw.write(linea1);
                     bw.newLine();
                     linea1 = br1.readLine();
                 } else {
                     bw.write(linea2);
                     bw.newLine();
                     linea2 = br2.readLine();
                 }
             }

             // Si quedan líneas en perso1
             while (linea1 != null) {
                 bw.write(linea1);
                 bw.newLine();
                 linea1 = br1.readLine();
             }

             // Si quedan líneas en perso2
             while (linea2 != null) {
                 bw.write(linea2);
                 bw.newLine();
                 linea2 = br2.readLine();
             }

             System.out.println("Archivo 'todos.txt' creado correctamente.");

         } catch (IOException e) {
             System.out.println("Error: " + e.getMessage());
         }
     }
}

