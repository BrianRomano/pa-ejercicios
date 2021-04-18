public class Triangulo extends FiguraGeometrica{

    private double base;
    private double altura;

    public Triangulo(String nombre, double base, double altura){
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

    public double calcularArea(){
        return getBase() * getAltura() / 2;
    }

    public String toString() {
        return getNombre()+" (area = "+calcularArea()+")";
    }
}
