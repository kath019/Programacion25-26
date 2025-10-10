import java.util.Scanner;

public class act5b_20 {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);

        //Declaración de variables
        double a;
        double b=0;
        double c;
        String iva;
        String cod;
        double cod1 = 0;
        double total;

        //Se pide los datos de ingreso
        System.out.println("Introduzca la base imponible:");
        a=sc.nextDouble();
        System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        iva=sc.next().toLowerCase();
        System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        cod=sc.next().toLowerCase();

        System.out.println("Base imponible: "+a);

        //Condicional para los casos de IVA
        if (iva.equals("general")) {
            b=a*21/100;
            System.out.println("IVA (21%) : "+b);
        } else if (iva.equals("reducido")) {
            b=a*10/100;
            System.out.println("IVA (10%) : "+b);
        } else if (iva.equals("superreducido")) {
            b=a*4/100;
            System.out.println("IVA (4%) : "+b);
        } else {
            System.out.println("Dato IVA inválido");
        }


        //Suma de la base más el IVA para saber el precio con IVA
        c=a+b;
        System.out.println("Precio con IVA: "+c);


        //Condicional para los casos del código rpomocional
        if (cod.equals("nopro")) {
            System.out.println("No se aplica promoción, precio: "+c);
        } else if (cod.equals("mitad")) {
            cod1=c/2;
            System.out.println("Cod. promo. (mitad):"+-cod1);
        } else if (cod.equals("meno5")) {
            cod1=c-5;
            System.out.println("Cod. promo. (meno5): "+-cod1);
        } else if (cod.equals("5porc")) {
            cod1=c-(c*5)/100;
            System.out.println("Cod. promo. (5porc): "+-cod1);
        } else {
            System.out.println("Código no válido");
        }

        //Cálculo del total
        total=c-cod1;
        System.out.println("TOTAL: "+total);
    }
}
