public class TestFiguras {

    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo("Rectangulo", 5, 3);
        rectangulo.calcularArea();

        Circulo circulo = new Circulo("Circulo", 4);
        circulo.calcularArea();

        Triangulo triangulo = new Triangulo("Triangulo", 5, 8);
        triangulo.calcularArea();

        System.out.println(rectangulo);
        System.out.println(circulo);
        System.out.println(triangulo);
    }
}
