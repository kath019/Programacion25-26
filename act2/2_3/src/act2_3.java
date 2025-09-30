import java.util.Scanner;

public class act2_3 {
public static  void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduzca un número");
    Scanner sc1=new Scanner(System.in);
    int n=sc1.nextInt();
    System.out.println("Introduzca otro número");
    int m=sc1.nextInt();
    System.out.println("La división de " +n+ " entre " +m+ " es:");
    System.out.println(n/m);

}
}
