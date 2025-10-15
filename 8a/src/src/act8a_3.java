import java.util.Scanner;

public class act8a_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaración de variables
        int n=(int) (Math.random()*100)+1;
        int intento;

        System.out.println("Intenta adivinar el número que he seleccionado entre 1 y 100");
        System.out.println("Si te rindes, inserta '-1' para conocer la respuesta");

        //Bucle hasta que coincida el número introducido con la variable
        while(true) {
            intento= sc.nextInt();
            if (intento==-1) {
                System.out.println("Te has rendido, el número era:"+n);
                break;
            }
            if (intento>n) {
                System.out.println("Menor");
            } else if (intento<n) {
                System.out.println("Mayor");
            }  else {
                System.out.println("Acertaste, el número era: "+n);
            }
        }
    }
}
