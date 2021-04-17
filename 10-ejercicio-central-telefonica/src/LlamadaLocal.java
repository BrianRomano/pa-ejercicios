public class LlamadaLocal extends Llamada{

    private double precio = 15;

    public LlamadaLocal(String numOrigen, String numDestino, int duracion) {
        super(numOrigen, numDestino, duracion);
    }

    // Calcular por unico precio
    public double calcularPrecio() {
        return getDuracion() * precio;
    }

    // Motrar
    public String toString() {
        return "Llamada Local: #" + getNumOrigen() + " - #" + getNumDestino()
                + " - " + getDuracion() + "seg.";

    }
}
