public class CamionMinero extends Maquinaria{

  public CamionMinero(){

  }

  public CamionMinero(String a, int b){
    setNombre(a);
    setAñosDeUso(b);
  }

  @Override
  public void operar(){
    System.out.println("Estoy transportando tierra y mi nombre es: " + getNombre());
  }

}