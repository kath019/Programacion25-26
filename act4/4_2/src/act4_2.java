import java.util.Scanner;

public class act4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaración de variables
        int n;
        int m;
        double media;

        //Cálculo de la media
        System.out.println("Introduzca la primera nota");
        n = sc.nextInt();
        System.out.println("Introduzca la segunda nota");
        m = sc.nextInt();
        System.out.println("La media es:");
        media = (double) (n+m)/2;
        System.out.println(media);

    }
}
