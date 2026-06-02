package banco;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();

        banco.abrirCuenta();

        Cuenta cuenta = new Cuenta(
                "001",
                "Kenneth");

        cuenta.depositar(100);

        cuenta.retirar(50);

        cuenta.mostrarSaldo();

    }
}