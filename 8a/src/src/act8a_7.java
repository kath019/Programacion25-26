public class act8a_7 {
    public static void main(String[] args) {

        //Declaracióan de variables
        int a;
        int producto = 1;

        //bucle para los 10 primeros números impares
        for (a=1;a<19;a+=2) {
            producto=producto*a;
        }
        System.out.println(producto);
    }
}
