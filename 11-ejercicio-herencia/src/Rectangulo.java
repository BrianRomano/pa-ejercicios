public class Rectangulo extends FiguraGeometrica {

    private double base;
    private double altura;

    public Rectangulo(String nombre, double base, double altura){
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularArea(){
        return getBase() * getAltura();
    }

    public String toString() {
        return getNombre()+" (area = "+calcularArea()+")";
    }
}
