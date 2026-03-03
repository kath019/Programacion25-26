import java.io.*;
import java.util.Scanner;

public class Act_3 {
    public static void main ( String [] args) {
//DUPLICAR EL ORIGINAL EN COPIA.TXT
        /*
        try {
            BufferedReader in = new BufferedReader(new FileReader("original.txt"));
            BufferedWriter out = new BufferedWriter(new FileWriter("copia.txt"));

            String linea = in.readLine();

            while (linea != null) {
                out.write(linea);
                out.newLine();
                linea = in.readLine();
            }

            in.close();
            out.close();

            System.out.println("Fichero duplicado correctamente en copia.txt");

        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        */

//VERSION 2: documento.txt → copia_de_documento.txt
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre del fichero a duplicar: ");
        String nombreOrigen = sc.nextLine();

        String nombreDestino = "copia_de_" + nombreOrigen;

        try {
            BufferedReader in = new BufferedReader(new FileReader(nombreOrigen));
            BufferedWriter out = new BufferedWriter(new FileWriter(nombreDestino));

            String linea = in.readLine();

            while (linea != null) {
                out.write(linea);
                out.newLine();
                linea = in.readLine();
            }

            in.close();
            out.close();

            System.out.println("Fichero duplicado correctamente en " + nombreDestino);

        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        sc.close();
    }
}
