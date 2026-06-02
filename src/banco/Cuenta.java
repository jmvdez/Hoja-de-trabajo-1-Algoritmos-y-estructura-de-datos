package banco;

public class Cuenta implements Operacion {

    private String numeroCuenta;
    private String titular;
    private double saldo;

    public Cuenta(String numeroCuenta, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0;
    }

    @Override
    public void depositar(double monto) {
        System.out.println("Depositando Q" + monto);
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Retirando Q" + monto);
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: Q" + saldo);
    }
}