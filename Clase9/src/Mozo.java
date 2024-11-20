public class Mozo extends Empleado{

  public int propina;

  public Mozo(String nombre, int sueldo, String puesto){
    super();
    this.nombre = nombre;
    this.sueldo = sueldo;
    this.puesto = puesto;
  }

  public void darPropina(int x){
    propina += x;
  }

  @Override
  public void averiguaSueldo(){
    System.out.println("Soy un Mozo y mi sueldo es de: " + (this.sueldo + this.propina));
  }

  public int getPropina() {
    return propina;
  }

  public void setPropina(int propina) {
    this.propina = propina;
  }

  

}
