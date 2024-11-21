
//Ejemplo Interface Set y SortedSet, clase HashSet y TreeSet aprenderaprogramar.com */
import java.util.Objects;
import java.util.Scanner;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

class Persona implements Comparable<Persona> {
    private int idPersona;
    private String nombre;
    private int altura;

    public Persona(int idPersona, String nombre, int altura) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona-> ID: " + idPersona + " Nombre: " + nombre + " Altura: " + altura + "\n";
    }

    @Override
    public int compareTo(Persona o) {
        return this.altura - o.altura;
    }

    @Override
    public int hashCode() {
        return altura + nombre.hashCode() + idPersona;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.idPersona != other.idPersona) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (this.altura != other.altura) {
            return false;
        }
        return true;
    }
}

/*
 * Ejemplo Interface Set y SortedSet, clase HashSet y TreeSet
 * aprenderaprogramar.com
 */

public class Exc {
    public static void main(String[] args) {
        try {
            muestraArray();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ha intentado acceder a una posición fuera del Array " + e.toString());
        } finally {
            System.out.println("Pasa por aquí");
        }
    }

    public static void muestraArray() {
        int[] array = { 4, 2, 6 };
        for (int i = 0; i <= 3; i++)
            System.out.println(array[i]);
    }
}
