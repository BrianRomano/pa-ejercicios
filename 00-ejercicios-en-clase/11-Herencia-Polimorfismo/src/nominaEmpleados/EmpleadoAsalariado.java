package nominaEmpleados;

//La clase concreta EmpleadoAsalariado extiende a la clase abstracta Empleado.

public class EmpleadoAsalariado extends Empleado 
{
private double salarioSemanal;

// constructor de cuatro argumentos
public EmpleadoAsalariado( String nombre, String apellido, String nss, 
   double salario )
{
   super( nombre, apellido, nss ); // los pasa al constructor de Empleado
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
} // fin del método establecerSalarioSemanal

// devuelve el salario
public double obtenerSalarioSemanal()
{
   return salarioSemanal;
} // fin del método obtenerSalarioSemanal

// calcula los ingresos; sobrescribe el método abstracto ingresos en Empleado
@Override
public double ingresos()
{
   return obtenerSalarioSemanal();
} // fin del método ingresos

// devuelve representación String de un objeto EmpleadoAsalariado
@Override
public String toString()
{
   return String.format( "empleado asalariado: %s\n%s: $%,.2f", 
      super.toString(), "salario semanal", obtenerSalarioSemanal() );
} // fin del método toString
} // fin de la clase EmpleadoAsalariado

