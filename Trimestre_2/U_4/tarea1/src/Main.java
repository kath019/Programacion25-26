//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ejercicio1.CuentaCorriente cc = new ejercicio1.CuentaCorriente("Lopera", "123456F");
        ejercicio1.CuentaCorriente cc2 = new ejercicio1.CuentaCorriente("Del Nido", "654321F");

        cc.mostrar_informacion();
        cc2.mostrar_informacion();


        cc.ingresar_dinero(100.0);
        cc.mostrar_informacion();
    }
}