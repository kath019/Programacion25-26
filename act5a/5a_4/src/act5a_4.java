import java.util.Scanner;

public class act5a_4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Declaración de variables
        int n;
        int m;
        int par=0;

        //Asignación de valores para n y m
        System.out.println("Introduzca un número:");
        n=scanner.nextInt();
        System.out.println("Introduzca otro número:");
        m=scanner.nextInt();

        //Suma de valores pares
        if(n%2==0){
            par++;
        } if(m%2==0){
            par++;
        }
        System.out.println("De los valores introducidos"+par+" son pares");
    }
}
