package cuentas;

public class CuentaCorriente {

	private Titular titular;
	private String num;
	protected double saldo;

	public CuentaCorriente(Titular titular, String num, double saldo) {
		this.titular = titular;
		this.num = num;
		this.saldo = saldo;
	}

	public CuentaCorriente(Titular titular, String num) {
		this(titular, num, 15.3);
	}

	public Titular getTitular() {
		return titular;
	}

	public String getNum() {
		return num;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double param) {
		saldo = param;
	}

	public void ingreso(double param) {
		saldo += param;
	}

	public void reintegro(double param) {
		saldo -= param;
	}

	public String toString() {
		return num + ": " + saldo;
	}

	public boolean equals(Object o) {
		if (num.compareTo(((CuentaCorriente) o).getNum()) == 0)
			return true;
		else
			return false;
	}
}
