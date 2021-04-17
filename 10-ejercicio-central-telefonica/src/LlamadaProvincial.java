public class LlamadaProvincial extends Llamada {

    private double precio1 = 20;
    private double precio2 = 25;
    private double precio3 = 30;
    private int franja = 0;

    public LlamadaProvincial(String numOrigen, String numDestino, double duracion, int franja) {
        super(numOrigen, numDestino, duracion);
        this.franja = franja;
    }

    // Calculo de precio segun franja
    public double calcularPrecio() {
        if (franja == 1)
            return getDuracion() * precio1;
        else if (franja == 2)
            return getDuracion() * precio2;
        else
            return getDuracion() * precio3;

    }

    // Mostrar
    public String toString() {
        return "Llamada Provincial: #" + getNumOrigen() + " - #"
                + getNumDestino() + " - " + getDuracion() + "seg. - #" + franja;
    }
}
