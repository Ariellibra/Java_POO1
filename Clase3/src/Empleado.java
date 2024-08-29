
import java.time.*;

public class Empleado
{
   private String nombre;
   private double salario;
   private LocalDate fecha_alta;

   public Empleado(String nombre, double salario, int year, int month, int day)
   {
      this.nombre  = nombre;
      this.salario = salario;
      fecha_alta   = LocalDate.of(year, month, day);
   }

   public String getNombre()
   {
      return nombre;
   }

   public double getSalario()
   {
      return salario;
   }

   public LocalDate getFecha_alta()
   {
      return fecha_alta;
   }

   public void raiseSalario(double byPercent)
   {
      double raise = salario * byPercent / 100;
      salario += raise;
   }
   
}
