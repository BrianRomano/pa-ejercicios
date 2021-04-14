package cuentas;

public class Titular {

    private String nombre;
    private String apellidos;
    private int edad;

    public Titular(String nombre, String apellidos, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String toString() {
        return "Nombre del titular: "+nombre+" "+apellidos+" | Edad: "+edad;
    }
}
