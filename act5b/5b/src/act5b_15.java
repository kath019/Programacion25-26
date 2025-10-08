import java.util.Scanner;

public class act5b_15 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        //Declaración de vaiable
        String m;
        int puntuacion=0;

        System.out.println("Cuestionario de fideliidad");
        System.out.println("Responder con verdader/falso");

        //Preguntas
        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        m=sc.nextLine().toLowerCase();
        if (m.equals("verdadero")) {
            puntuacion+=3;
        }
        System.out.println("2. Ha aumentado sus gastos de vestuario");
        m=sc.nextLine().toLowerCase();
        if (m.equals("verdadero")) {
            puntuacion += 3;
        }
        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti.");
        m=sc.nextLine().toLowerCase();
        if (m.equals("verdadero")) {
            puntuacion+=3;
        }
        System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).");
        m=sc.nextLine().toLowerCase();
        if (m.equals("verdadero")) {
            puntuacion+=3;
        }
        System.out.println("5. No te deja que mires la agenda de su teléfono móvil.");
        m=sc.nextLine().toLowerCase();
        if (m.equals("verdadero")) {
            puntuacion+=3;
        }
        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.");
        m=sc.nextLine().toLowerCase();
        if (m.equals("verdadero")) {
            puntuacion+=3;
        }
        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
        m=sc.nextLine().toLowerCase();
        if (m.equals("verdadero")) {
            puntuacion+=3;
        }
        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
        m=sc.nextLine().toLowerCase();
        if (m.equals("verdadero")) {
            puntuacion+=3;
        }
        System.out.println("9. Has notado que últimamente se perfuma más.");
        m=sc.nextLine().toLowerCase();
        if (m.equals("verdadero")) {
            puntuacion+=3;
        }
        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
        m=sc.nextLine().toLowerCase();
        if (m.equals("verdadero")) {
            puntuacion+=3;
        }
        if (puntuacion<11 || puntuacion>=0) {
            System.out.println("¡Enhorabuena! Tu pareja parece ser totalmente fiel.");
        } else if (puntuacion<23 || puntuacion>=11) {
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        } else {
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
        }

    }
}
