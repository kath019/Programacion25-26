public class ejercicio1 {
    public static class CuentaCorriente {
        private Double saldo;
        private Double limite_descubrimiento;
        private String nombre;
        private String dni;

        /*creación de métodos*/
        public CuentaCorriente(String nombre, String dni){
            saldo=0.0;
            limite_descubrimiento = -50.0;
            this.nombre = nombre;
            this.dni =dni;
        }

        public boolean sacar_dinero(Double retirar) {
            if (retirar >= saldo + limite_descubrimiento){
                return false;
            } else {
                saldo = saldo - retirar;
                System.out.println("Se ha podido realizar la operación de retirada");
                return true;
            }

        }

        public void ingresar_dinero (Double ingreso) {
            saldo += ingreso;
        }

        public void mostrar_informacion () {
            System.out.println("Nombre: "+nombre);
            System.out.println("DNI: "+ dni);
            System.out.println("Saldo: "+ saldo);
        }
    }
}
