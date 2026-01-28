//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(("Biblioteca digital"));

        Libro libro1 = new Libro("Los juegos del Hambre", "Suzanne Collins", 2008);
        libro1.agregarCapitulo(new Capitulo(1, "Introducción", Formato.TEXTO));
        libro1.agregarCapitulo(new Capitulo(2,"Primera parte", Formato.ILUSTRADO));

        Libro libro2 =new Libro("El principito", "Antoine de Saint-Exupéry", 1943);
        libro2.agregarCapitulo(new Capitulo(1, "Capítulo 1", Formato.INTERACTIVO));
        libro2.agregarCapitulo(new Capitulo(2, " Capítulo 2", Formato.TEXTO));

        Libro libro3 =new Libro("El corazón delator", "Edgar Allan Poe", 1843);
        libro3.agregarCapitulo(new Capitulo(1, "Ojo de buitre", Formato.ILUSTRADO));
        libro3.agregarCapitulo(new Capitulo(2, "Final del latido ", Formato.INTERACTIVO));

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);


        biblioteca.mostrarLibros();
    }
}