import java.io.*;
import java.util.Scanner;

public class Act_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 1 si desea ver el libro de firmas, o 2 si desea introducir una firma: ");
        int eleccion = sc.nextInt();
        sc.nextLine(); // Limpiar salto de línea

        if (eleccion < 1 || eleccion > 2) {
            System.out.println("Dato fuera de rango");

        } else if (eleccion == 1) {

            try (BufferedReader in = new BufferedReader(new FileReader("firmas.txt"))) {
                String linea;
                System.out.println("Contenido del fichero:");

                while ((linea = in.readLine()) != null) {
                    System.out.println(linea);
                }

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } else {

            System.out.println("Ingrese una nueva firma: ");
            String firma = sc.nextLine();
            boolean existe = false;

            try (BufferedReader in = new BufferedReader(new FileReader("firmas.txt"))) {
                String linea;

                while ((linea = in.readLine()) != null) {
                    if (linea.equalsIgnoreCase(firma)) {
                        existe = true;
                        break;
                    }
                }

            } catch (FileNotFoundException e) {
                // Si el archivo no existe, no pasa nada, se creará luego
            } catch (IOException e) {
                System.out.println("Error al leer el archivo.");
            }

            if (existe) {
                System.out.println("Ya existe una firma con ese nombre.");
            } else {
                try (BufferedWriter out = new BufferedWriter(new FileWriter("firmas.txt", true))) {
                    out.write(firma);
                    out.newLine();
                    System.out.println("Firma añadida correctamente.");
                } catch (IOException e) {
                    System.out.println("Error al escribir en el archivo.");
                }
            }
        }

        sc.close();
    }
}