import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

      Perro perrito1 = new Perro();
      Perro perrito2 = new Perro("Boby", "Chiguagua", "Marron");
      Perro perrito3 = new Perro();

      Scanner teclado = new Scanner(System.in);

      System.out.println("Escriba mi nombre: ");
      perrito3.setNombre(teclado.nextLine());

      System.out.println("Que raza soy: ");
      perrito3.setRaza(teclado.nextLine());

      System.out.println("Que color tengo: ");
      perrito3.setColor(teclado.nextLine());

      teclado.close();

      perrito1.ladrar();
      perrito2.comer();
      perrito3.moverCola();
      
      System.out.println(perrito1);
      System.out.println(perrito2);
      System.out.println(perrito3);
    }      
}