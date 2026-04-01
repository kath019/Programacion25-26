//Actividad 9: Crear un fichero binario e insertar varios objetos de tipo Tren. Cerrar el fichero y leerlo a continuación,
// mostrándo los objetos por pantalla.

import java.io.*;

public class Ejercicio_9 implements Serializable {
    private String nombre;
    private int capacidad;

    public Ejercicio_9(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Tren: " + nombre + ", Capacidad: " + capacidad;
    }


    //clase main

    public static void main(String[] args) {

        try {
            // ESCRIBIR OBJETOS
            ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("trenes.bin"));

            escribir.writeObject(new Ejercicio_9("AVE", 300));
            escribir.writeObject(new Ejercicio_9("Talgo", 200));
            escribir.writeObject(new Ejercicio_9("Cercanías", 500));

            escribir.close();
            System.out.println("Objetos guardados.");

            // LEER OBJETOS
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream("trenes.bin"));

            try {
                while (true) {
                    Ejercicio_9 t = (Ejercicio_9) leer.readObject();
                    System.out.println(t);
                }
            } catch (EOFException e) {
                System.out.println("Fin del fichero.");
            }

            leer.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error en el archivo.");
        }
    }
}
