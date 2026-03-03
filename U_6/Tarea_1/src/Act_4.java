import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Act_4 {
    public static void main (String [] args) {

            int contCaracter = 0;
            int contPalabra = 0;
            int contLinea = 0;


        try {
            BufferedReader in = new BufferedReader(new FileReader("carta.txt"));
            String linea = in.readLine();

            while(linea != null){
                contLinea++;
                contCaracter += linea.length();

                if(!linea.equals("")) {
                    contPalabra += linea.split(" ").length;
                }
                linea = in.readLine();
            }
            in.close();
            System.out.println("Número de líneas: " + contLinea);
            System.out.println("Número de palabras: " + contPalabra);
            System.out.println("Número de caracteres: " + contCaracter);

        }  catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }
}
