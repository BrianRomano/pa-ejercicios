package cuentas;

public class TestCuentas {

	public static void main(String[] args) {
		Titular t1 = new Titular("Ignacio", "Lopez", 35);
		CuentaCorriente c1 = new CuentaCorriente(t1, "123456789");
		CuentaAhorro c2 = new CuentaAhorro(new Titular("Pedro", "Ramirez", 43), "123456781", 100.5, 1.7);
		System.out.println("Cuenta1: " + c1);
		System.out.println("Cuenta2: " + c2);
		c1.reintegro(1.2);
		c2.ingreso(1.2);
		System.out.println("Cuenta1: " + c1);
		System.out.println("Cuenta2: " + c2);
		c2.calcularInteres();
		System.out.println("Cuenta2: " + c2);
		System.out.println("¿Son la misma cuenta?: " + c2.equals(c1));
	}

}
