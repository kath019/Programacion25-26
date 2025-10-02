import java.util.Scanner;

public class act5b_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaración de variable
        int n;

        //Cálculo de salario
        System.out.println("Introduzca el número de horas trabajadas durante la semana:");
        n = sc.nextInt();

        System.out.println("El sueldo semanal que le corresponde es de:");
        if (n>=0 && n<=40) {
            System.out.println(n*12);
        } else if (n>=41 && n<=168) {
            System.out.println(n*16);
        } else {
            System.out.println("Error");
        }

    }
}
