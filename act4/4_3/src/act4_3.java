import java.util.Scanner;

public class act4_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //Declaración de variables
        double n;
        double m;
        double r;
        int media;

        //Cálculo de la media
        System.out.println("Introduzca la primera nota");
        n = sc.nextDouble();
        System.out.println("Introduzca la segunda nota");
        m = sc.nextDouble();
        System.out.println("Introduzca la tercea nota");
        r = sc.nextDouble();
        System.out.println("La media es:");
        media = (int) (n+m+r)/3;
        System.out.println(media);
    }
}
