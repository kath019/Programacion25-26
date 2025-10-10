import java.util.Scanner;

public class act5b_21 {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);

        //Declaración de variables
        int sbase = 0;
        int sbruto;
        int viaje;
        int viaje1;
        int cargo;
        int estado;
        double irpf=0;
        double neto;

        //Asignación de valores para las variables
        System.out.println("CARGOS DE LOS EMPLEADOS:");
        System.out.println("1 - Programador junior \n2 - Programador senior \n3 - Jefe de proyecto");
        System.out.println("Introduzca el cargo del empleado (1 - 3): ");
        cargo =sc.nextInt();

        System.out.println("¿Cuántos días ha estado de viaje visitando clientes?:");
        viaje=sc.nextInt();

        System.out.println("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        estado= sc.nextInt();

        //Condicional para el cargo del empleado
        if (cargo == 1) {
            sbase= 950;
            System.out.println("Sueldo base:"+sbase);
        } else if (cargo==2) {
            sbase=1200;
            System.out.println("Sueldo base:"+sbase);
        } else if (cargo==3) {
            sbase=1600;
            System.out.println("Sueldo base: "+sbase);
        } else {
            System.out.println("Puesto no válido");
        }

        //Total de sueldo base más viajes
        viaje1=(viaje*30)+sbase;
        System.out.println("Dietas ("+viaje+" viajes): "+viaje1);

        System.out.println("Sueldo bruto: ");
        sbruto=viaje1+sbase;
        System.out.println(sbruto);

        //Condicional para el estado
        if (estado==1) {
            irpf= (double) (sbruto * 25) /100;
            System.out.println("Retención IRPF (25%): "+irpf);
        } else if (estado==2) {
            irpf=(double) (sbruto * 20)/100;
            System.out.println("Retención IRPF (20%): "+irpf);
        } else {
            System.out.println("Estado civil no válido");
        }

        //Cálculo del sueldo neto
        neto=sbruto-irpf;
        System.out.println("Sueldo neto:"+neto);

    }
}
