import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Act_2 {
    public static void main ( String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su nombre:");
        String nombre = sc.nextLine();
        System.out.println("Introduzca su edad:");
        int edad = sc.nextInt();

        try {
            FileWriter fw = new FileWriter("datos.txt", false);
            PrintWriter pw = new PrintWriter(fw);

            pw.println("Nombre: " + nombre);
            pw.println("Edad: " + edad);

            pw.close();
            fw.close();

            System.out.println("Los datos se guardaron correctamente");

        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        sc.close();
    }
}
