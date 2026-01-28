public class Biblioteca {

    private String nombre;
    private Libro[] libros;
    private int cantidadLibros;

    private static final String BIBLIOTECARIO = "Daniel Rojas";

    //constructor
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new Libro[20];
        this.cantidadLibros = 0;
    }

    //métodos
    public String getNombre() {
        return nombre;
    }

    public static String getBibliotecario() {
        return BIBLIOTECARIO;
    }

    public void agregarLibro(Libro libro) {
        if (cantidadLibros >= 20) {
            System.out.println("No se pueden agregar más libros.");
            return;
        }
        libros[cantidadLibros++] = libro;
    }

    public void mostrarLibros() {
        System.out.println("Biblioteca: " + nombre);
        System.out.println("Bibliotecario responsable: " + BIBLIOTECARIO);
        for (int i = 0; i < cantidadLibros; i++) {
            System.out.println(libros[i]);
            libros[i].mostrarCapitulos();
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Biblioteca: " + nombre + " | Bibliotecario: " + BIBLIOTECARIO;
    }
}
