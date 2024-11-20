public class Excavadora extends Maquinaria{

  public Excavadora(){

  }

  public Excavadora(String a, int b){
    setNombre(a);
    setAñosDeUso(b);
  }

  @Override
  public void operar(){
    System.out.println("Estoy sacando tierra y mi nombre es: " + getNombre());
  }

}
