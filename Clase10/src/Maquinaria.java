public class Maquinaria {

  private String nombre;
  private int añosDeUso;
  
  public Maquinaria() {
  }

  public Maquinaria(String nombre, int añosDeUso) {
    this.nombre = nombre;
    this.añosDeUso = añosDeUso;
  }

  public void operar(){
    System.out.println("Operando la maquina");
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getAñosDeUso() {
    return añosDeUso;
  }

  public void setAñosDeUso(int añosDeUso) {
    this.añosDeUso = añosDeUso;
  }
}
