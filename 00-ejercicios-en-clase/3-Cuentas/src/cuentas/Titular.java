package cuentas;

public class Titular {
	
	private String nombre;
	private String apellidos;
	private int edad;

	public Titular(String param1, String param2, int param3) {
		nombre = param1;
		apellidos = param2;
		edad = param3;
	}

	public String toString() {
		return nombre + " " + apellidos + " " + edad;
	}

}
