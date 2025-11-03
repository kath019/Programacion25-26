import java.util.Scanner;

public class booleanVocal {
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una letra:");
        char letra = sc.next().charAt(0);
        if (esVocal(letra)) {
            System.out.println("La letra "+letra+" es una vocal");
        } else {
            System.out.println("La letra "+letra+" no es una vocal");
        }

    }
    public  static boolean esVocal(char a) {
        a = Character.toLowerCase(a);
        return (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u');
    }
}
