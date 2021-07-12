import java.lang.Math;

public class Circulo extends FiguraGeometrica {

    private double radio;

    public Circulo(String nombre, double radio){
        super(nombre);
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(getRadio(), 2);
    }

    public String toString() {
        return getNombre()+" (area = "+calcularArea()+")";
    }
}
