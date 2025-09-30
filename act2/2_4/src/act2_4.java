import java.util.Scanner;

public class act2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca valor de millas");
        int millas = sc.nextInt();
        System.out.println("Conversión a metros:");
        int metros = millas*1609;
        System.out.println(metros+"m");
    }
}
