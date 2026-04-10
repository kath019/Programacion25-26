import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class GestorIA implements Serializable{
    private final Map<String, PlataformaIA> plataformas;
    private final Map<String, ModeloIA> modelos;

    private final Map<PlataformaIA, Set<ModeloIA>> plataformaModelos;
    private final Map<ModeloIA, Set<PlataformaIA>> modeloPlataformas;

    public GestorIA() {
        plataformas = new HashMap<>();
        modelos = new HashMap<>();
        plataformaModelos = new HashMap<>();
        modeloPlataformas = new HashMap<>();
    }

    public void addPlataforma(PlataformaIA p) {
        plataformas.put(p.getNombre(), p);
        plataformaModelos.putIfAbsent(p, new HashSet<>());
    }

    public void addModelo(ModeloIA m) {
        modelos.put(m.getNombre(), m);
        modeloPlataformas.putIfAbsent(m, new HashSet<>());
    }

    public void addDespliegue(PlataformaIA p, ModeloIA m){
        plataformaModelos.get(p).add(m);
        modeloPlataformas.get(m).add(p);
    }

    public List<ModeloIA> getModelos(PlataformaIA p) {
        List<ModeloIA> lista = new ArrayList<>(plataformaModelos.getOrDefault(p, new HashSet<>()));
        lista.sort(Comparator.comparing(ModeloIA::getNombre));
        return lista;
    }

    public List<PlataformaIA> getPlataformas(ModeloIA m) {
        List<PlataformaIA> lista = new ArrayList<>(modeloPlataformas.getOrDefault(m, new HashSet<>()));
        lista.sort(Comparator.comparing(PlataformaIA::getNombre));
        return lista;
    }

    public PlataformaIA getPlataforma(String nombre){
        return plataformas.get(nombre);
    }

    public void removePlataforma(String nombre){
        PlataformaIA p = plataformas.remove(nombre);
        if (p != null) {
            Set<ModeloIA> modelosAsociados = plataformaModelos.remove(p);

            if (modelosAsociados != null) {
                for (ModeloIA m : modelosAsociados) {
                    modeloPlataformas.get(m).remove(p);
                }
            }
        }
    }

    public ModeloIA getModelo(String nombreModelo){
        return modelos.get(nombreModelo);
    }

    public void guardarDatos(){
        try (ObjectOutputStream guardar = new ObjectOutputStream(new FileOutputStream("ia_data.dat"))){
            guardar.writeObject(this);
            guardar.close();
            System.out.println("Datos guardados correctamente");

        } catch (IOException e) {
            System.out.println("No se pudieron guardar los datos");
        }
    }

    public static GestorIA cargarDatos(){
        try (ObjectInputStream cargar = new ObjectInputStream(new FileInputStream("ia_data.dat"))) {
            System.out.println("Datos cargados correctamente");
            return (GestorIA) cargar.readObject();
        } catch (Exception e) {
            System.out.println("No se pudieron cargar los datos");
            return new GestorIA();
        }
    }

}
