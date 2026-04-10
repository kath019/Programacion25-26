import java.io.Serializable;
import java.util.Objects;

public class PlataformaIA implements Serializable {
    private String nombre;
    private String empresa;
    private TipoPlataforma tipo;
    private String id;

    public PlataformaIA(String nombre, String empresa, TipoPlataforma tipo, String id) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.tipo = tipo;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public TipoPlataforma getTipo() {
        return tipo;
    }

    public void setTipo(TipoPlataforma tipo) {
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlataformaIA that = (PlataformaIA) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, empresa, tipo, id);
    }

    @Override
    public String toString() {
        return "PlataformaIA{" +
                "nombre='" + nombre + '\'' +
                ", empresa='" + empresa + '\'' +
                ", tipo=" + tipo +
                ", id='" + id + '\'' +
                '}';
    }
}
