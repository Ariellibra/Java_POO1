public class Ingeniero {

  private String nombre;
  private int añosDeExperiencia;
  private String especialidad;
  
  public Ingeniero() {
  }

  public Ingeniero(String nombre, int añosDeExperiencia, String especialidad) {
    this.nombre = nombre;
    this.añosDeExperiencia = añosDeExperiencia;
    this.especialidad = especialidad;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getAñosDeExperiencia() {
    return añosDeExperiencia;
  }

  public void setAñosDeExperiencia(int añosDeExperiencia) {
    this.añosDeExperiencia = añosDeExperiencia;
  }

  public String getEspecialidad() {
    return especialidad;
  }

  public void setEspecialidad(String especialidad) {
    this.especialidad = especialidad;
  }
}
