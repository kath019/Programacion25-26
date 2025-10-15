public class act8a_6 {
    public static void main(String[] args) {

        //Declaración de variable
        int a;
        int b;

        System.out.println("Multiplos de 7 del 1 al 100:");
        for (a = 1; a<=100; a++) {
           b=a*7;
           if (b<=100) {
               System.out.println(b);
           }
        }
    }
}
