package data;

public class Persona {

    private String nombre;
    private int dni;
    private String fechaNacimiento;
    private int cont;

    public Persona(String nombre, int dni, String fechaNacimiento){
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String toString() {
        cont ++;
        return nombre+", DNI: "+dni+" nacido el : "+fechaNacimiento+"("+cont+")";
    }
}
