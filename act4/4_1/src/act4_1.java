public class act4_1 {
    public static void main(String[] args) {
        //Declaración de variables
        short vMax= 32767;
        short vMin= -32768;

        //Mostrar el valor máximo de la variable
        System.out.println("El valor máximo de un short es " + vMax);

        //Mostrar vMax + 1
        System.out.println("El valor de "+vMax+" + " + " 1 es:");
        short valor= (short) (vMax + 1);
        System.out.println(valor);
    }
}
