public class Alumno {
   
  public String nombre;

  public Alumno(){


  }

  public Alumno(String nombre){
    this.nombre = nombre;
  }
  

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void pintar(Lapiz lapicito){
    System.out.println("Soy " +this.nombre + " Estoy pitando con el lapiz");
    lapicito.pintar();
  }    
  
  public void dibujar(Lapiz lapicito){
    System.out.println("Soy " + this.nombre + " Estoy dibujando con el lapiz" );
    lapicito.dibujar();
  }

}
