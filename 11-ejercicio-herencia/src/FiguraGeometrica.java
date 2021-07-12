public abstract class FiguraGeometrica {

    private String nombre;
    private Rectangulo rectangulo;
    private Circulo circulo;
    private Triangulo triangulo;

    public FiguraGeometrica(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public abstract double calcularArea();
}
