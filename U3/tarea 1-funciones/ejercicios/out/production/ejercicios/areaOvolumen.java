import java.util.Scanner;

public class areaOvolumen {
    public static void main ( String args []) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el radio de la base de del cilindro:");
        double r = sc.nextDouble();
        System.out.print("Introduzca la altura del cilindro: ");
        double h = sc.nextDouble();

        System.out.print("Introduzca 1 si desea calcular el área, o 2 si desea calcular el volumen: ");
        int variante = sc.nextInt();
        if (variante == 1) {
            area(r, h);
        } else if (variante == 2){
            volumen (r, h);
        } else {
            System.out.println("Dato introducido erróneo");
        }
    }
    public static void area(double r, double h) {

        double at = 2 * Math.PI * r * (h + r);
        System.out.println("El área del cilindro es: "+at);
    }
    public static void volumen (double r, double h) {
        double vol = Math.PI * r * r *h;
        System.out.println("El volumen del cilindro es: "+vol);
        return;
    }
}
