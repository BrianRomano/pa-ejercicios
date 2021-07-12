package nominaEmpleados;

public class EmpleadoPorComision extends Empleado 
{
   private double ventasBrutas; // ventas totales por semana
   private double tarifaComision; // porcentaje de comisión

   // constructor con cinco argumentos
   public EmpleadoPorComision( String nombre, String apellido, String nss, 
      double ventas, double tarifa )
   {
      super( nombre, apellido, nss );
      establecerVentasBrutas( ventas );
      establecerTarifaComision( tarifa );
   } // fin del constructor de EmpleadoPorComision con cinco argumentos

   // establece la tarifa de comisión
   public void establecerTarifaComision( double tarifa )
   {
      if ( tarifa > 0.0 && tarifa < 1.0 )
         tarifaComision = tarifa;
      else
         throw new IllegalArgumentException(
            "La tarifa de comision debe ser > 0.0 y < 1.0" );
   } // fin del método establecerTarifaComision

   // devuelve la tarifa de comisión
   public double obtenerTarifaComision()
   {
      return tarifaComision;
   } // fin del método obtenerTarifaComision

   // establece el monto de ventas brutas
   public void establecerVentasBrutas( double ventas )
   {
      if (ventas >= 0.0 )
         ventasBrutas = ventas;
      else
         throw new IllegalArgumentException(
            "Las ventas brutas deben ser >= 0.0" );
   } // fin del método establecerVentasBrutas

   // devuelve el monto de ventas brutas
   public double obtenerVentasBrutas()
   {
      return ventasBrutas;
   } // fin del método obtenerVentasBrutas

   // calcula los ingresos; sobrescribe el método abstracto ingresos en Empleado
 

   // devuelve representación String de un objeto EmpleadoPorComision
   @Override
   public String toString()
   {
      return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f", 
         "empleado por comision", super.toString(), 
         "ventas brutas", obtenerVentasBrutas(), 
         "tarifa de comision", obtenerTarifaComision() );
   } // fin del método toString

@Override
public double obtenerMontoPago() {
	
	return obtenerTarifaComision() * obtenerVentasBrutas();
}
} // fin de la clase EmpleadoPorComision