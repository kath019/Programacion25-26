import java.util.Scanner;

public class act8a_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaración de variables
        int alt;
        int i;
        int j;

        //Asignación de la altura del triángulo
        System.out.println("Ingrese la altura del triángulo: ");
        alt=sc.nextInt();
        if (alt<0){
            System.out.println("La altura debe ser positiva");
            return;
        }

        //Construcción del triángulo
        for (i=alt;i>0;i--) {
            for (j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
