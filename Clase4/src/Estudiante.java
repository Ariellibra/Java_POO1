import java.util.ArrayList;

public class Estudiante {
  
  private String nombre;
  private String apellido;
  private int numeroMatricula;
  private ArrayList<Integer> calificaciones;

  
  
  public Estudiante(String nombre, String apellido, int numeroMatricula) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.numeroMatricula = numeroMatricula;
  }

  public void agregarCalificacion(int calificacion){
    calificaciones.add(calificacion);
  }

  public void calcularPromedio(float promedio){

  }
  

}
