import java.io.Serializable;
import java.util.Objects;

public class ModeloIA implements Serializable {
    private String nombre;
    private String version;
    private int parametros;
    private String especialidad;
    private String id;

    public ModeloIA(String nombre, String version, int parametros, String especialidad, String id) {
        this.nombre = nombre;
        this.version = version;
        this.parametros = parametros;
        this.especialidad = especialidad;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getParametros() {
        return parametros;
    }

    public void setParametros(int parametros) {
        this.parametros = parametros;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
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
        ModeloIA modeloIA = (ModeloIA) o;
        return parametros == modeloIA.parametros && Objects.equals(nombre, modeloIA.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, version, parametros, especialidad, id);
    }

    @Override
    public String toString() {
        return "ModeloIA{" +
                "nombre='" + nombre + '\'' +
                ", version='" + version + '\'' +
                ", parametros=" + parametros +
                ", especialidad='" + especialidad + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
