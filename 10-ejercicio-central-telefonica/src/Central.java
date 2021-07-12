public class Central {

    private int contador = 0;
    private double acumulador = 0;

    public int totalLlamadas() {
        return contador;
    }

    public double totalFacturado() {
        return acumulador;
    }

    // Mostrar llamada y contabilizar
    public void registrarLlamada(Llamada llamada) {
        System.out.println(llamada);
        contador++;
        acumulador += llamada.calcularPrecio();
    }

    // Mostrar recuento de llamadas y facturación
    public String toString() {
        return "Contador de llamadas: "+totalLlamadas()+" | Total facturado: $"+totalFacturado();
    }
}
