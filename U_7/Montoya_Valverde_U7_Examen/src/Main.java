import java.util.List;

public class Main {
    public static void main(String[] args) {
        GestorIA gestor = new GestorIA();

        // Plataformas
        PlataformaIA p1 = new PlataformaIA("P1", "ChatGPT", TipoPlataforma.MULTIMODAL, "OpenAI");
        PlataformaIA p2 = new PlataformaIA("P2", "Opera", TipoPlataforma.IMAGEN, "OpenAI");
        PlataformaIA p3 = new PlataformaIA("P3", "Gemini", TipoPlataforma.AUDIO, "Google");
        PlataformaIA p4 = new PlataformaIA("P4", "Claude", TipoPlataforma.TEXTO, "Google");

        gestor.addPlataforma(p1);
        gestor.addPlataforma(p2);
        gestor.addPlataforma(p3);
        gestor.addPlataforma(p4);

        // Modelos
        ModeloIA m1 = new ModeloIA("M1", "GPT-4", 1700, "Conversación", "4.0");
        ModeloIA m2 = new ModeloIA("M2", "Gemini Pro", 540, "Multimodal", "1.0");
        ModeloIA m3 = new ModeloIA("M3", "Claude 3", 300, "Texto", "3.0");
        ModeloIA m4 = new ModeloIA("M4", "Stable Diffusion", 7, "Imagen", "2.1");

        gestor.addModelo(m1);
        gestor.addModelo(m2);
        gestor.addModelo(m3);
        gestor.addModelo(m4);

        // Despliegues
        gestor.addDespliegue(p1, m1);
        gestor.addDespliegue(p2, m2);
        gestor.addDespliegue(p3, m3);
        gestor.addDespliegue(p4, m4);
        gestor.addDespliegue(p1, m2);


        System.out.println("Modelos:");
        List<ModeloIA> modelos = gestor.getModelos(p1);
        modelos.forEach(System.out::println);

        System.out.println("\nPlataformas:");
        List<PlataformaIA> plataformas = gestor.getPlataformas(m1);
        plataformas.forEach(System.out::println);

        gestor.guardarDatos();
        GestorIA gestorCargado = GestorIA.cargarDatos();
    }
}