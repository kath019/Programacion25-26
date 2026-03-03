import java.io.*;

public class Act_5 {
    public static void main (String [] args) {
        String texto = "";
        try{
            BufferedReader in = new BufferedReader(new FileReader("numeros.txt"));
            String linea =in.readLine();

            if (linea == null) {
                System.out.println("El archivo está vacío.");
                in.close();
                return;
            }
            int numero = Integer.parseInt(linea);
            int max = 0;
            int min = 0;

            linea = in.readLine();

            while(linea != null) {
               numero = Integer.parseInt(linea);

               if(numero > max) {
                   max = numero;
               }
               if (numero < min) {
                   min = numero;
               }

                linea = in.readLine();

            }in.close();

            System.out.println("Número mayor: " + max);
            System.out.println("Número menor: " + min);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NumberFormatException e) {
            System.out.println("El archivo contiene valores no numéricos.");
        }
    }
}
