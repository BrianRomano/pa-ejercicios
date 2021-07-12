package cuentas;

public class CuentaAhorro extends CuentaCorriente {
	private double interes;

	public CuentaAhorro(Titular t, String num, double saldo, double interes) {
		super(t, num, saldo);
		this.interes = interes;
	}

	public CuentaAhorro(Titular t, String num, double interes) {
		super(t, num, 15.3);
		this.interes = interes;
	}

	public CuentaAhorro(Titular t, String num) {
		super(t, num, 15.3);
		interes = 2.5;
	}

	public double getInteres() {
		return interes;
	}

	public void calcularInteres() {
		//setSaldo(getSaldo() + getSaldo() * interes);
		saldo=saldo * interes;
	}

}
