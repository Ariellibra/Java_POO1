import java.util.HashSet;
import java.util.Set;

public class App {
  public static void main(String[] args) throws Exception {

    Set<String> invitados = new HashSet<String>();

    invitados.add("Ariel");
    invitados.add("Nashe");
    invitados.add("Un Picante");

    System.out.println(invitados);
    System.out.println(invitados.contains("Ariel"));
    System.out.println(invitados.size());

  }
}
