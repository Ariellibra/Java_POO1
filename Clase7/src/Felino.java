public class Felino {

  private String tipo;
  private String pelaje;
  

  public Felino() {
  }

  public Felino(String tipo) {
    this.tipo = tipo;
  }

  public void trepar(){
    System.out.println("Estoy trepando y soy un: " + this.tipo);
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getPelaje() {
    return pelaje;
  }

  public void setPelaje(String pelaje) {
    this.pelaje = pelaje;
  }

}
