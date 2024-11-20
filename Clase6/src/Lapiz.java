public class Lapiz {

  private String color;
  private String largo;

  public Lapiz() {
  }
  public Lapiz(String color, String largo) {
    this.color = color;
    this.largo = largo;
  }

  public void pintar(){
    System.out.println("Estoy pintando de color: " + this.color);
  }

  public void dibujar(){
    System.out.println("Estoy dibujando algo: " + this.largo);
  }
  

  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public String getLargo() {
    return largo;
  }
  public void setLargo(String largo) {
    this.largo = largo;
  }

  
  

}
