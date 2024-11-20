public abstract class Empleado{

  public String nombre;
  public int sueldo;
  public String puesto;
  
  public Empleado() {
  }

  public void getTipoEmpleado(Empleado tal){
    System.out.println(tal.puesto);
  }
  //abstract public void averiguaSueldo();

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getSueldo() {
    return sueldo;
  }

  public void setSueldo(int sueldo) {
    this.sueldo = sueldo;
  }

  public String getPuesto() {
    return puesto;
  }

  public void setPuesto(String puesto) {
    this.puesto = puesto;
  }

  

}
