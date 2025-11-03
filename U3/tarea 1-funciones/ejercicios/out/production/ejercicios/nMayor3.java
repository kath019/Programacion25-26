import java.util.Scanner;

public class nMayor3 {
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primer número:");
        int n1 = sc.nextInt();

        System.out.println("Introduzca el segundo número;");
        int n2 =sc.nextInt();

        System.out.println("Introduzca el tercer número:");
        int n3 = sc.nextInt();

        System.out.println("El mayor de los tres números es: ");
        mayor2(n1, n2, n3);
    }
    public  static void mayor2 (int n1, int n2, int n3) {
        int max = Math.max(n3, Math.max(n1, n2));
        System.out.println(max);
        return;
    }
}
