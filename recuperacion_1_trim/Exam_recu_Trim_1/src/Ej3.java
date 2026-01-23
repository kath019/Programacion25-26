import java.util.Scanner;


public class Ej3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 10 números: ");
        int [] original = new int[10];
        for (int i = 0; i < original.length;i++){
            original[i]= sc.nextInt();
        }

        System.out.println("Array original");
        mostrarconIndice(original);

        int [] arrayNuevo = calcularPrimos(original);

        //llamamos a la función para mostrar el nuevo array ordenado
        System.out.println("Array reordenado: ");
        mostrarconIndice(arrayNuevo);

    }

    //funcion para asociar los índices con los elementos del array
    public static void mostrarconIndice(int []array) {
        //índices
        for (int i = 0; i < array.length;i++){
            System.out.print(i + "\t");
        }
        System.out.println();

        //valores
        for(int num: array) {
            System.out.print(num + "\t");
        }
        System.out.println("\n");
    }

    //funcion para rellenar el array primero con primos y luego con los demás
    static int [] calcularPrimos (int[] original){
        int [] nuevo = new int [original.length];
        int indice = 0;

        //se rellena primero con los primos
        for (int num: original){
            if (num % 2 != 0){
                nuevo[indice++] = num;
            }
        }

        //se añade el resto de números
        for (int num : original) {
            if (num % 2 == 0) {
                nuevo[indice++] = num;
            }
        }
        return nuevo;
    }

}
