package cuentas;

public class CuentaAhorro extends CuentaCorriente{

    private double interes;

    public CuentaAhorro(Titular titular, String numeroCuenta, double saldo, double interes){
        super(titular, numeroCuenta, saldo);
        this.interes = interes;
    }

    // Constructor que inicia el saldo en 15.3
    public CuentaAhorro(Titular titular, String numeroCuenta, double interes){
        super(titular, numeroCuenta, 15.3);
        this.interes = interes;
    }

    // Constructor que inicia el saldo en 15.3 y el interes en 2.5
    public CuentaAhorro(Titular titular, String numeroCuenta){
        super(titular, numeroCuenta, 15.3);
        interes = 2.5;
    }

    public double getInteres() {
        return interes;
    }

    public void calcularInteres(){
        setSaldo(getSaldo() + getSaldo() * interes);
    }
}
