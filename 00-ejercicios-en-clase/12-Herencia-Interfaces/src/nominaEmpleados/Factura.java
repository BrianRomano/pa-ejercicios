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
      establecerPrecioPorArticulo( precio ); // valida y almacena el precio por art�culo
   } // fin del constructor de Factura con cuatro argumentos

   // establece el n�mero de pieza
   public void establecerNumeroPieza( String pieza )
   {
      numeroPieza = pieza;  // deber�a validar  
   } // fin del m�todo establecerNumeroPieza

   // obtiene el n�mero de pieza
   public String obtenerNumeroPieza()
   {
      return numeroPieza;
   } // fin del m�todo obtenerNumeroPieza

   // establece la descripci�n
   public void establecerDescripcionPieza( String descripcion )
   {
      descripcionPieza = descripcion;  // deber�a validar
   } // fin del m�todo establecerDescripcionPieza

   // obtiene la descripci�n
   public String obtenerDescripcionPieza()
   {
      return descripcionPieza;
   } // fin del m�todo obtenerDescripcionPieza

   // establece la cantidad
   public void establecerCantidad( int cuenta )
   {
      if ( cuenta >= 0 )
         cantidad = cuenta;
      else
         throw new IllegalArgumentException ( "Cantidad debe ser >= 0" );
   } // fin del m�todo establecerCantidad

   // obtener cantidad
   public int obtenerCantidad()
   {
      return cantidad;
   } // fin del m�todo obtenerCantidad

   // establece el precio por art�culo
   public void establecerPrecioPorArticulo( double precio )
   {
      if ( precio >= 0.0 )
         precioPorArticulo = precio;
      else
         throw new IllegalArgumentException(
            "El precio por articulo debe ser >= 0" );
   } // fin del m�todo establecerPrecioPorArticulo

   // obtiene el precio por art�culo
   public double obtenerPrecioPorArticulo()
   {
      return precioPorArticulo;
   } // fin del m�todo obtenerPrecioPorArticulo

   // devuelve representaci�n String de un objeto Factura
   @Override
   public String toString()
   {
      return 
         "factura" + "\nnumero de pieza"+ obtenerNumeroPieza()+ " " +obtenerDescripcionPieza()+ 
         "cantidad"+ obtenerCantidad()+ "precio por articulo" + obtenerPrecioPorArticulo() ;
   } // fin del m�todo toString

   // m�todo requerido para realizar el contrato con la interfaz PorPagar
   @Override
   public double obtenerMontoPago() 
   {
      return obtenerCantidad() * obtenerPrecioPorArticulo(); // calcula el costo total
   } // fin del m�todo obtenerMontoPago
} // fin de la clase Factura