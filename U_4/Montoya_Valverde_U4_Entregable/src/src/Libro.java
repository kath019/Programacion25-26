public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private Capitulo[] capitulos;
    private int cantidadCapitulos;

    //constructor
    public Libro (String titulo, String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.capitulos = new Capitulo[30];
        this.cantidadCapitulos = 0;
    }

    //getters y setters
    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getAnioPublicacion(){
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion){
        this.anioPublicacion = anioPublicacion;
    }

    public void agregarCapitulo(Capitulo capitulo) {
        if(cantidadCapitulos >= 30) {
            System.out.print("No se pueden agregar más capítulos");
            return;
        }

        for (int i = 0; i <  cantidadCapitulos; i++) {
            if(capitulos[i].getNumero() == capitulo.getNumero()) {
                System.out.println("Ya existe un capítulo con ese número.");
            }
        }
        capitulos[cantidadCapitulos++] = capitulo;
    }

    public void eliminarCapitulo(int numero) {
        for (int i = 0; i < cantidadCapitulos; i++) {
            if (capitulos[i].getNumero() == numero) {
                for (int j = i; j < cantidadCapitulos -1; j++) {
                    capitulos[j] =capitulos [j + 1];
                }
                capitulos[--cantidadCapitulos] = null;
                return;
            }
        }
        System.out.println("Capitulo no encontrado.");
    }

    public void mostrarCapitulos() {
        for (int i = 0; i < cantidadCapitulos; i++){
            capitulos[i].mostrarDetalles();
        }
    }

    @Override
    public String toString(){
        return "Libro: " + titulo + "| Autor " + autor + " | Año: " + anioPublicacion;
    }
}
