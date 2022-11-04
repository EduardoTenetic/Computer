/*
 Ayala Cueto Eduardo Tenetic
 */
public class Banco {
    public static void main(String[] args) {
        Cuenta cuenta1=new Cuenta();
        Cliente cliente1=new Cliente();
        cuenta1.setNumCuenta(123);
        cuenta1.setTipoCuenta("Ahorro");
        cuenta1.setCliente(cliente1);
    }
}
