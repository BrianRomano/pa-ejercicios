package nominaEmpleados;

public class Factura implements PorPagar
{
   private String numeroPieza; 
   private String descripcionPieza;
   private int cantidad;
   private double precioPorArticulo;

   // constructor con cuatro argumentos
   public Factura( String pieza, String descripcion, int cuenta, 
      double precio )
   {
      numeroPieza = pieza;
      descripcionPieza = descripcion;
      establecerCantidad( cuenta ); // valida y almacena la cantidad
      establecerPrecioPorArticulo( precio ); // valida y almacena el precio por artículo
   } // fin del constructor de Factura con cuatro argumentos

   // establece el número de pieza
   public void establecerNumeroPieza( String pieza )
   {
      numeroPieza = pieza;  // debería validar  
   } // fin del método establecerNumeroPieza

   // obtiene el número de pieza
   public String obtenerNumeroPieza()
   {
      return numeroPieza;
   } // fin del método obtenerNumeroPieza

   // establece la descripción
   public void establecerDescripcionPieza( String descripcion )
   {
      descripcionPieza = descripcion;  // debería validar
   } // fin del método establecerDescripcionPieza

   // obtiene la descripción
   public String obtenerDescripcionPieza()
   {
      return descripcionPieza;
   } // fin del método obtenerDescripcionPieza

   // establece la cantidad
   public void establecerCantidad( int cuenta )
   {
      if ( cuenta >= 0 )
         cantidad = cuenta;
      else
         throw new IllegalArgumentException ( "Cantidad debe ser >= 0" );
   } // fin del método establecerCantidad

   // obtener cantidad
   public int obtenerCantidad()
   {
      return cantidad;
   } // fin del método obtenerCantidad

   // establece el precio por artículo
   public void establecerPrecioPorArticulo( double precio )
   {
      if ( precio >= 0.0 )
         precioPorArticulo = precio;
      else
         throw new IllegalArgumentException(
            "El precio por articulo debe ser >= 0" );
   } // fin del método establecerPrecioPorArticulo

   // obtiene el precio por artículo
   public double obtenerPrecioPorArticulo()
   {
      return precioPorArticulo;
   } // fin del método obtenerPrecioPorArticulo

   // devuelve representación String de un objeto Factura
   @Override
   public String toString()
   {
      return 
         "factura" + "\nnumero de pieza"+ obtenerNumeroPieza()+ " " +obtenerDescripcionPieza()+ 
         "cantidad"+ obtenerCantidad()+ "precio por articulo" + obtenerPrecioPorArticulo() ;
   } // fin del método toString

   // método requerido para realizar el contrato con la interfaz PorPagar
   @Override
   public double obtenerMontoPago() 
   {
      return obtenerCantidad() * obtenerPrecioPorArticulo(); // calcula el costo total
   } // fin del método obtenerMontoPago
} // fin de la clase Factura