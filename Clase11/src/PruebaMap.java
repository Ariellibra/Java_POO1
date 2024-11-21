import java.util.Map;
import java.util.HashMap;

public class PruebaMap {
  public static void main(String[] args) {

    Map<String, String> hechizos = new HashMap<>();

    hechizos.put("Anashe", "Un hechizo que anashe todo");
    hechizos.put("NoTrabajo", "Te borra todo lo que hiciste");
    hechizos.put("MoonaCall", "Llama a una gata molesta");

    todas(hechizos);

    buscar("Anashe", hechizos);

    System.err.println(hechizos.keySet());

    eliminar("NoTrabajo", hechizos);

    System.err.println(hechizos.keySet());

    todas(hechizos);
  }

  public static void buscar(String s, Map<String, String> j) {
    if (j.containsKey(s)) {
      System.err.println(j.get(s));
    } else {
      System.err.println("False");
    }
  }

  public static void eliminar(String s, Map<String, String> j) {
    if (j.containsKey(s)) {
      System.out.println("Se borro el hechizo " + s);
      j.remove(s);
    } else {
      System.err.println("False");
    }
  }

  public static void todas(Map<String, String> j) {
    for (Map.Entry<String, String> entry : j.entrySet()) {
      System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
    }
  }

}
