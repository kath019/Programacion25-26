import java.util.Scanner;

public class act2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una temperatura: en ºC");
        int temperatura = sc.nextInt();
        System.out.println("Equivalencia en grados Farenheit:");
        System.out.print(temperatura=9*temperatura/5+32);

    }
}
