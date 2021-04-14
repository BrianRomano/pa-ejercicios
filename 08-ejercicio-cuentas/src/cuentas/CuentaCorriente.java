package cuentas;

public class CuentaCorriente {

    private Titular titular;
    private String numeroCuenta;
    private double saldo;

    public CuentaCorriente(Titular titular, String numeroCuenta, double saldo){
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    // Saldo inicia en 15.3
    public CuentaCorriente(Titular titular, String numeroCuenta){
        this(titular, numeroCuenta, 15.3);
    }

    public Titular getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresar(double cantidadIngresada){
        this.saldo += cantidadIngresada;
    }

    public void reintegrar(double cantidadRegresada){
        this.saldo -= cantidadRegresada;
    }

    // Mostrar numeroCuenta y saldo
    public String toString() {
        return "Numero de cuenta: "+numeroCuenta+" |  Saldo: "+saldo;
    }

    // Comparar dos cuentas
    public boolean equals(Object o) {
        if (numeroCuenta.compareTo(((CuentaCorriente) o).getNumeroCuenta()) == 0)
            return true;
        else
            return false;
    }
}
