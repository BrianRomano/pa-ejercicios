public class CentralTest {

    public static void main(String[] args) {

        // Creación de objeto Central Telefonica
        Central central = new Central();

        // Llamadas Locales
        LlamadaLocal llamadaLocalUno = new LlamadaLocal("123456", "456789", 15);
        central.registrarLlamada(llamadaLocalUno);
        LlamadaLocal llamadaLocalDos = new LlamadaLocal("159357", "785236", 30);
        central.registrarLlamada(llamadaLocalDos);
        LlamadaLocal llamadaLocalTres = new LlamadaLocal("852369", "147852", 45);
        central.registrarLlamada(llamadaLocalTres);

        // Llamadas Provinciales
        LlamadaProvincial llamadaProvinciallUno = new LlamadaProvincial ("123456", "456789", 15, 1);
        central.registrarLlamada(llamadaProvinciallUno);
        LlamadaProvincial  llamadaProvincialDos = new LlamadaProvincial ("159357", "785236", 30, 2);
        central.registrarLlamada(llamadaProvincialDos);
        LlamadaProvincial  llamadaProvincialTres = new LlamadaProvincial ("852369", "147852", 45, 3);
        central.registrarLlamada(llamadaProvincialTres);

        // Mostrar
        System.out.println(central);
    }
}
