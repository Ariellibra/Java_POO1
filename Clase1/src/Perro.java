public class Perro {

  String nombre;
  String raza;
  String color;

  public Perro() {
    this.nombre = "Tony";
    this.raza = "Callejero";
    this.color = "Marron con negro";
  }

  public Perro(String nombre, String raza, String color) {
    this.nombre = nombre;
    this.raza = raza;
    this.color = color;
  }

  public void ladrar(){
    System.out.println("Guau mi nombre es: " + this.nombre);
  }

  public void comer(){
    System.out.println("Toy comiendo: " + this.nombre);
  }

  public void moverCola(){
    System.out.println("Estoy moviendo la cola: " + this.nombre);
  }

  @Override
  public String toString() {
    return "Perro [nombre=" + nombre + ", raza=" + raza + ", color=" + color + "]";
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  


}
