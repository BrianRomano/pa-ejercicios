package nominaEmpleados;
public class EmpleadoAsalariado extends Empleado 
{
   private double salarioSemanal;

   // constructor con cuatro argumentos
   public EmpleadoAsalariado( String nombre, String apellido, String nss, 
      double salario )
   {
      super( nombre, apellido, nss ); // pasa argumentos al constructor de Empleado
      establecerSalarioSemanal( salario ); // valida y almacena el salario
   } // fin del constructor de EmpleadoAsalariado con cuatro argumentos

   // establece el salario
   public void establecerSalarioSemanal( double salario )
   {
      if (salario >= 0.0 )
         salarioSemanal = salario;
      else
         throw new IllegalArgumentException(
            "El salario semanal debe ser >= 0.0" );
   } // fin del m�todo establecerSalarioSemanal

   // devuelve el salario
   public double obtenerSalarioSemanal()
   {
      return salarioSemanal;
   } // fin del m�todo obtenerSalarioSemanal

   // calcula los ingresos; implementa el m�todo de la interfaz PorPagar
   // que era abstracto en la superclase Empleado
   @Override
   public double obtenerMontoPago()
   {
      return obtenerSalarioSemanal();
   } // fin del m�todo obtenerMontoPago

   // devuelve representaci�n String de un objeto EmpleadoAsalariado
   @Override
   public String toString()
   {
      return String.format( "empleado asalariado: %s\n%s: $%,.2f", 
         super.toString(), "salario semanal", obtenerSalarioSemanal() );
   } // fin del m�todo toString
} // fin de la clase EmpleadoAsalariado
