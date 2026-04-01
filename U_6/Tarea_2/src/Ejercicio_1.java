//Actividad 1: Pedir un double por consola y guardarlo en un archivo binario.

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte un número:");
        double numero = sc.nextDouble();

        try{
            DataOutputStream binario = new DataOutputStream(new FileOutputStream("archivo.bin"));
            binario.writeDouble(numero);
            binario.close();
            System.out.println("Número guardado corectamente");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
