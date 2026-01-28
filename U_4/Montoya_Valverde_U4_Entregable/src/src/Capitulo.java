public class Capitulo {
    private int numero;
    private String titulo;
    private Formato formato;

    public Capitulo (int numero, String titulo, Formato formato) {
        this.numero = numero;
        this.titulo = titulo;
        this.formato = formato;
    }

    //métodos
    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public void mostrarDetalles() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Capítulo " + numero + " - " + titulo + " (" + formato + ")";
    }
}
