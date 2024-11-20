public class Cajero extends Empleado{

  public Cajero(String nombre, int sueldo, String puesto){
    super();
    this.nombre = nombre;
    this.sueldo = sueldo;
    this.puesto = puesto;
  }

  @Override
  public void averiguaSueldo(){
    System.out.println("Soy un Cajero y mi sueldo es de: " + this.sueldo);
  }

}
